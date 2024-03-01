const base = {
    get() {
                return {
            url : "http://localhost:8080/springbootmt74k/",
            name: "springbootmt74k",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootmt74k/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "景区旅游门票系统"
        } 
    }
}
export default base

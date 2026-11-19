; CONF_module_add @ 00a0c964
00a0c964	stp x29,x30,[sp, #-0x10]!
00a0c968	mov x3,x2
00a0c96c	mov x2,x1
00a0c970	mov x1,x0
00a0c974	mov x0,xzr
00a0c978	mov x29,sp
00a0c97c	bl 0x00a0c990
00a0c980	cmp x0,#0x0
00a0c984	cset w0,ne
00a0c988	ldp x29,x30,[sp], #0x10
00a0c98c	ret

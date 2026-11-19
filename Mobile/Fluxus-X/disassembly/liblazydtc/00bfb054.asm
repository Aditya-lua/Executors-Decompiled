; std::__ndk1::locale::locale @ 00bfb054
00bfb054	paciasp
00bfb058	stp x29,x30,[sp, #-0x30]!
00bfb05c	str x21,[sp, #0x10]
00bfb060	stp x20,x19,[sp, #0x20]
00bfb064	mov x29,sp
00bfb068	mov x20,x0
00bfb06c	mov w0,#0x138
00bfb070	mov x21,x1
00bfb074	bl 0x00c2fed0
00bfb078	mov x19,x0
00bfb07c	mov x1,x21
00bfb080	mov x2,xzr
00bfb084	bl 0x00bf52bc
00bfb088	add x1,x19,#0x8
00bfb08c	mov w0,#0x1
00bfb090	str x19,[x20]
00bfb094	bl 0x00c2bce0
00bfb098	ldp x20,x19,[sp, #0x20]
00bfb09c	ldr x21,[sp, #0x10]
00bfb0a0	ldp x29,x30,[sp], #0x30
00bfb0a4	autiasp
00bfb0a8	ret

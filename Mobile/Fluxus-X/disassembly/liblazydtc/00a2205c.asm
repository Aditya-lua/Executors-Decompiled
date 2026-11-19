; DSA_size @ 00a2205c
00a2205c	ldr x8,[x0, #0x10]
00a22060	cbz x8,0x00a22090
00a22064	sub sp,sp,#0x20
00a22068	mov x0,sp
00a2206c	mov x1,xzr
00a22070	stp x29,x30,[sp, #0x10]
00a22074	add x29,sp,#0x10
00a22078	stp x8,x8,[sp]
00a2207c	bl 0x00a21f44
00a22080	ldp x29,x30,[sp, #0x10]
00a22084	bic w0,w0,w0, ASR #0x1f
00a22088	add sp,sp,#0x20
00a2208c	ret
00a22090	mov w0,#0xffffffff
00a22094	ret

; DSA_SIG_set0 @ 00a220b4
00a220b4	str x21,[sp, #-0x30]!
00a220b8	stp x20,x19,[sp, #0x10]
00a220bc	mov x20,x0
00a220c0	mov w0,wzr
00a220c4	stp x29,x30,[sp, #0x20]
00a220c8	add x29,sp,#0x20
00a220cc	cbz x1,0x00a220f4
00a220d0	mov x19,x2
00a220d4	cbz x2,0x00a220f4
00a220d8	ldr x0,[x20]
00a220dc	mov x21,x1
00a220e0	bl 0x00c322e0
00a220e4	ldr x0,[x20, #0x8]
00a220e8	bl 0x00c322e0
00a220ec	mov w0,#0x1
00a220f0	stp x21,x19,[x20]
00a220f4	ldp x29,x30,[sp, #0x20]
00a220f8	ldp x20,x19,[sp, #0x10]
00a220fc	ldr x21,[sp], #0x30
00a22100	ret

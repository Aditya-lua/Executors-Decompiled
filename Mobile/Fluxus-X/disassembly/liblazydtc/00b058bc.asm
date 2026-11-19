; X509V3_add_value @ 00b058bc
00b058bc	str x21,[sp, #-0x30]!
00b058c0	stp x20,x19,[sp, #0x10]
00b058c4	mov x19,x2
00b058c8	mov x20,x1
00b058cc	mov x21,x0
00b058d0	stp x29,x30,[sp, #0x20]
00b058d4	add x29,sp,#0x20
00b058d8	cbz x1,0x00b058ec
00b058dc	mov x0,x20
00b058e0	bl 0x00c2ff50
00b058e4	mov x2,x0
00b058e8	b 0x00b058f0
00b058ec	mov x2,xzr
00b058f0	mov x1,x20
00b058f4	mov x3,x19
00b058f8	ldp x29,x30,[sp, #0x20]
00b058fc	ldp x20,x19,[sp, #0x10]
00b05900	mov x0,x21
00b05904	ldr x21,[sp], #0x30
00b05908	b 0x00b0590c

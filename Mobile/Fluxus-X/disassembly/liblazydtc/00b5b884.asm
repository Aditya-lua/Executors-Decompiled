; FUN_00b5b884 @ 00b5b884
00b5b884	sub sp,sp,#0x30
00b5b888	stp x20,x19,[sp, #0x10]
00b5b88c	stp x29,x30,[sp, #0x20]
00b5b890	add x29,sp,#0x20
00b5b894	stp xzr,xzr,[sp]
00b5b898	cbz x1,0x00b5b980
00b5b89c	mov x20,x1
00b5b8a0	adrp x1,0x29e000
00b5b8a4	mov x19,x0
00b5b8a8	add x1,x1,#0x95d
00b5b8ac	mov x0,x20
00b5b8b0	bl 0x00c36530
00b5b8b4	cbz x0,0x00b5b8c4
00b5b8b8	add x1,x19,#0xc
00b5b8bc	bl 0x00c36520
00b5b8c0	cbz w0,0x00b5b984
00b5b8c4	adrp x1,0x2d4000
00b5b8c8	add x1,x1,#0x8bf
00b5b8cc	mov x0,x20
00b5b8d0	bl 0x00c36530
00b5b8d4	cbz x0,0x00b5b914
00b5b8d8	add x1,sp,#0x8
00b5b8dc	mov x3,sp
00b5b8e0	mov x2,xzr
00b5b8e4	bl 0x00c3ace0
00b5b8e8	cbz w0,0x00b5b984
00b5b8ec	ldr x0,[x19, #0x18]
00b5b8f0	adrp x1,0x2ae000
00b5b8f4	add x1,x1,#0xbcc
00b5b8f8	mov w2,#0xbd
00b5b8fc	bl 0x00c32310
00b5b900	ldr x8,[sp, #0x8]
00b5b904	str x8,[x19, #0x18]
00b5b908	ldr x8,[sp]
00b5b90c	stp x8,xzr,[x19, #0x28]
00b5b910	str xzr,[sp, #0x8]
00b5b914	adrp x1,0x2da000
00b5b918	add x1,x1,#0xc74
00b5b91c	mov x0,x20
00b5b920	bl 0x00c36530
00b5b924	cbz x0,0x00b5b960
00b5b928	add x1,sp,#0x8
00b5b92c	mov x3,sp
00b5b930	mov x2,xzr
00b5b934	bl 0x00c3ace0
00b5b938	cbz w0,0x00b5b984
00b5b93c	ldr x0,[x19, #0x20]
00b5b940	adrp x1,0x2ae000
00b5b944	add x1,x1,#0xbcc
00b5b948	mov w2,#0xc8
00b5b94c	bl 0x00c32310
00b5b950	ldr x8,[sp, #0x8]
00b5b954	str x8,[x19, #0x20]
00b5b958	ldr x8,[sp]
00b5b95c	str x8,[x19, #0x38]
00b5b960	adrp x1,0x2bc000
00b5b964	add x1,x1,#0x3b2
00b5b968	mov x0,x20
00b5b96c	bl 0x00c36530
00b5b970	cbz x0,0x00b5b980
00b5b974	add x1,x19,#0x10
00b5b978	bl 0x00c3e920
00b5b97c	cbz w0,0x00b5b984
00b5b980	mov w0,#0x1
00b5b984	ldp x29,x30,[sp, #0x20]
00b5b988	ldp x20,x19,[sp, #0x10]
00b5b98c	add sp,sp,#0x30
00b5b990	ret

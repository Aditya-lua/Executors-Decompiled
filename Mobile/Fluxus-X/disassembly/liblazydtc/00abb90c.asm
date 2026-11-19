; PKCS12_item_decrypt_d2i_ex @ 00abb90c
00abb90c	sub sp,sp,#0x50
00abb910	stp x29,x30,[sp, #0x40]
00abb914	add x29,sp,#0x40
00abb918	stp x20,x19,[sp, #0x30]
00abb91c	stur xzr,[x29, #-0x18]
00abb920	str wzr,[sp, #0x1c]
00abb924	mov w9,w3
00abb928	ldr x3,[x4, #0x8]
00abb92c	ldr w4,[x4]
00abb930	mov x8,x6
00abb934	mov w20,w5
00abb938	mov x19,x1
00abb93c	sub x5,x29,#0x18
00abb940	add x6,sp,#0x1c
00abb944	stp x8,x7,[sp]
00abb948	mov x1,x2
00abb94c	mov w2,w9
00abb950	mov w7,wzr
00abb954	bl 0x00abb5a4
00abb958	cbz x0,0x00abb9d4
00abb95c	ldur x8,[x29, #-0x18]
00abb960	ldrsw x2,[sp, #0x1c]
00abb964	add x1,sp,#0x20
00abb968	mov x0,xzr
00abb96c	mov x3,x19
00abb970	str x8,[sp, #0x20]
00abb974	bl 0x00c36150
00abb978	mov x19,x0
00abb97c	cbz w20,0x00abb98c
00abb980	ldur x0,[x29, #-0x18]
00abb984	ldrsw x1,[sp, #0x1c]
00abb988	bl 0x00c34750
00abb98c	cbnz x19,0x00abb9bc
00abb990	bl 0x00c342a0
00abb994	adrp x0,0x2d2000
00abb998	adrp x2,0x2a0000
00abb99c	add x0,x0,#0x244
00abb9a0	add x2,x2,#0xb0b
00abb9a4	mov w1,#0x99
00abb9a8	bl 0x00c342b0
00abb9ac	mov w0,#0x23
00abb9b0	mov w1,#0x65
00abb9b4	mov x2,xzr
00abb9b8	bl 0x00c342c0
00abb9bc	ldur x0,[x29, #-0x18]
00abb9c0	adrp x1,0x2d2000
00abb9c4	add x1,x1,#0x244
00abb9c8	mov w2,#0x9a
00abb9cc	bl 0x00c32310
00abb9d0	b 0x00abb9d8
00abb9d4	mov x19,xzr
00abb9d8	mov x0,x19
00abb9dc	ldp x29,x30,[sp, #0x40]
00abb9e0	ldp x20,x19,[sp, #0x30]
00abb9e4	add sp,sp,#0x50
00abb9e8	ret

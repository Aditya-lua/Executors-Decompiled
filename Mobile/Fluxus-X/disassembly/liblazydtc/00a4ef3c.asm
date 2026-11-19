; OSSL_DECODER_do_all_provided @ 00a4ef3c
00a4ef3c	sub sp,sp,#0x70
00a4ef40	str x21,[sp, #0x40]
00a4ef44	stp x20,x19,[sp, #0x50]
00a4ef48	mov x20,x2
00a4ef4c	mov x21,x1
00a4ef50	mov x19,x0
00a4ef54	str x0,[sp, #0x10]
00a4ef58	add x0,sp,#0x10
00a4ef5c	mov w1,wzr
00a4ef60	mov x2,xzr
00a4ef64	mov x3,xzr
00a4ef68	stp x29,x30,[sp, #0x60]
00a4ef6c	add x29,sp,#0x60
00a4ef70	str xzr,[sp, #0x30]
00a4ef74	bl 0x00a4ea54
00a4ef78	ldr x0,[sp, #0x30]
00a4ef7c	stp x21,x20,[sp]
00a4ef80	cbz x0,0x00a4ef94
00a4ef84	adrp x1,0xa4e000
00a4ef88	add x1,x1,#0xfd8
00a4ef8c	mov x2,sp
00a4ef90	bl 0x00c3b5a0
00a4ef94	adrp x2,0xc5d000
00a4ef98	add x2,x2,#0x58
00a4ef9c	mov w1,#0xb
00a4efa0	mov x0,x19
00a4efa4	bl 0x00c3b520
00a4efa8	adrp x1,0xa4e000
00a4efac	add x1,x1,#0xfd8
00a4efb0	mov x2,sp
00a4efb4	bl 0x00c3b5a0
00a4efb8	ldr x0,[sp, #0x30]
00a4efbc	cbz x0,0x00a4efc4
00a4efc0	bl 0x00c3b5c0
00a4efc4	ldp x29,x30,[sp, #0x60]
00a4efc8	ldp x20,x19,[sp, #0x50]
00a4efcc	ldr x21,[sp, #0x40]
00a4efd0	add sp,sp,#0x70
00a4efd4	ret

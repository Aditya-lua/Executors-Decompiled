; X509_new_ex @ 00b1eb78
00b1eb78	str x21,[sp, #-0x30]!
00b1eb7c	stp x20,x19,[sp, #0x10]
00b1eb80	mov x20,x1
00b1eb84	mov x21,x0
00b1eb88	adrp x0,0xc82000
00b1eb8c	add x0,x0,#0x968
00b1eb90	mov x1,x21
00b1eb94	mov x2,x20
00b1eb98	stp x29,x30,[sp, #0x20]
00b1eb9c	add x29,sp,#0x20
00b1eba0	bl 0x00c380f0
00b1eba4	mov x19,x0
00b1eba8	cbz x0,0x00b1ebfc
00b1ebac	ldr x0,[x19, #0x178]
00b1ebb0	adrp x1,0x29e000
00b1ebb4	add x1,x1,#0xcf5
00b1ebb8	mov w2,#0x96
00b1ebbc	str x21,[x19, #0x170]
00b1ebc0	bl 0x00c32310
00b1ebc4	str xzr,[x19, #0x178]
00b1ebc8	cbz x20,0x00b1ebfc
00b1ebcc	adrp x1,0x29e000
00b1ebd0	add x1,x1,#0xcf5
00b1ebd4	mov w2,#0x99
00b1ebd8	mov x0,x20
00b1ebdc	bl 0x00c34600
00b1ebe0	str x0,[x19, #0x178]
00b1ebe4	cbnz x0,0x00b1ebfc
00b1ebe8	adrp x1,0xc82000
00b1ebec	add x1,x1,#0x968
00b1ebf0	mov x0,x19
00b1ebf4	bl 0x00c36160
00b1ebf8	mov x19,xzr
00b1ebfc	mov x0,x19
00b1ec00	ldp x29,x30,[sp, #0x20]
00b1ec04	ldp x20,x19,[sp, #0x10]
00b1ec08	ldr x21,[sp], #0x30
00b1ec0c	ret

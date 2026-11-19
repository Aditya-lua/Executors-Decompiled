; BN_BLINDING_convert_ex @ 00ad103c
00ad103c	stp x22,x21,[sp, #-0x30]!
00ad1040	stp x20,x19,[sp, #0x10]
00ad1044	stp x29,x30,[sp, #0x20]
00ad1048	ldr x8,[x2]
00ad104c	add x29,sp,#0x20
00ad1050	cbz x8,0x00ad1090
00ad1054	ldr x8,[x2, #0x8]
00ad1058	mov x21,x2
00ad105c	cbz x8,0x00ad1090
00ad1060	ldr w8,[x21, #0x28]
00ad1064	mov x19,x3
00ad1068	mov x22,x1
00ad106c	mov x20,x0
00ad1070	cmn w8,#0x1
00ad1074	b.eq 0x00ad10d0
00ad1078	mov x0,x21
00ad107c	mov x1,x19
00ad1080	bl 0x00ad0ccc
00ad1084	cbz w0,0x00ad10bc
00ad1088	cbnz x22,0x00ad10d8
00ad108c	b 0x00ad10e8
00ad1090	bl 0x00c342a0
00ad1094	adrp x0,0x2be000
00ad1098	adrp x2,0x2c2000
00ad109c	add x0,x0,#0x30a
00ad10a0	add x2,x2,#0x32e
00ad10a4	mov w1,#0x8d
00ad10a8	bl 0x00c342b0
00ad10ac	orr w0,wzr,#0x3
00ad10b0	mov w1,#0x6b
00ad10b4	mov x2,xzr
00ad10b8	bl 0x00c342c0
00ad10bc	ldp x29,x30,[sp, #0x20]
00ad10c0	ldp x20,x19,[sp, #0x10]
00ad10c4	mov w0,wzr
00ad10c8	ldp x22,x21,[sp], #0x30
00ad10cc	ret
00ad10d0	str wzr,[x21, #0x28]
00ad10d4	cbz x22,0x00ad10e8
00ad10d8	ldr x1,[x21, #0x8]
00ad10dc	mov x0,x22
00ad10e0	bl 0x00c36990
00ad10e4	cbz x0,0x00ad10bc
00ad10e8	ldr x3,[x21, #0x38]
00ad10ec	ldr x2,[x21]
00ad10f0	cbz x3,0x00ad1110
00ad10f4	mov x0,x20
00ad10f8	mov x1,x20
00ad10fc	mov x4,x19
00ad1100	ldp x29,x30,[sp, #0x20]
00ad1104	ldp x20,x19,[sp, #0x10]
00ad1108	ldp x22,x21,[sp], #0x30
00ad110c	b 0x00c38d60
00ad1110	ldr x3,[x21, #0x18]
00ad1114	mov x0,x20
00ad1118	mov x1,x20
00ad111c	mov x4,x19
00ad1120	ldp x29,x30,[sp, #0x20]
00ad1124	ldp x20,x19,[sp, #0x10]
00ad1128	ldp x22,x21,[sp], #0x30
00ad112c	b 0x00c38ef0

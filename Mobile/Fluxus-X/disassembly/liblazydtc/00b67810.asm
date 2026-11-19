; ossl_gcm_set_ctx_params @ 00b67810
00b67810	sub sp,sp,#0x50
00b67814	str x23,[sp, #0x10]
00b67818	stp x22,x21,[sp, #0x20]
00b6781c	stp x20,x19,[sp, #0x30]
00b67820	stp x29,x30,[sp, #0x40]
00b67824	add x29,sp,#0x40
00b67828	cbz x1,0x00b67b60
00b6782c	mov x20,x1
00b67830	adrp x1,0x2c5000
00b67834	mov x19,x0
00b67838	add x1,x1,#0xa75
00b6783c	mov x0,x20
00b67840	bl 0x00c36530
00b67844	cbz x0,0x00b67878
00b67848	add x8,x19,#0xd5
00b6784c	add x1,sp,#0x8
00b67850	mov w2,#0x10
00b67854	add x3,sp,#0x18
00b67858	str x8,[sp, #0x8]
00b6785c	bl 0x00c3ace0
00b67860	cbz w0,0x00b678f8
00b67864	ldr x8,[sp, #0x18]
00b67868	cbz x8,0x00b678d0
00b6786c	ldrb w9,[x19, #0x54]
00b67870	tbnz w9,#0x0,0x00b678d0
00b67874	str x8,[x19, #0x18]
00b67878	adrp x1,0x2c3000
00b6787c	add x1,x1,#0x9bc
00b67880	mov x0,x20
00b67884	bl 0x00c36530
00b67888	cbz x0,0x00b67950
00b6788c	add x1,sp,#0x18
00b67890	bl 0x00c3e920
00b67894	cbz w0,0x00b67914
00b67898	ldr x8,[sp, #0x18]
00b6789c	sub x9,x8,#0x1
00b678a0	cmp x9,#0x80
00b678a4	b.cc 0x00b67930
00b678a8	bl 0x00c342a0
00b678ac	adrp x0,0x2ac000
00b678b0	adrp x2,0x2ba000
00b678b4	add x0,x0,#0xc00
00b678b8	add x2,x2,#0xb96
00b678bc	mov w1,#0x105
00b678c0	bl 0x00c342b0
00b678c4	mov w0,#0x39
00b678c8	mov w1,#0x6d
00b678cc	b 0x00b67aa8
00b678d0	bl 0x00c342a0
00b678d4	adrp x0,0x2ac000
00b678d8	adrp x2,0x2ba000
00b678dc	add x0,x0,#0xc00
00b678e0	add x2,x2,#0xb96
00b678e4	orr w1,wzr,#0xf8
00b678e8	bl 0x00c342b0
00b678ec	mov w0,#0x39
00b678f0	mov w1,#0x6e
00b678f4	b 0x00b67aa8
00b678f8	bl 0x00c342a0
00b678fc	adrp x0,0x2ac000
00b67900	adrp x2,0x2ba000
00b67904	add x0,x0,#0xc00
00b67908	add x2,x2,#0xb96
00b6790c	mov w1,#0xf4
00b67910	b 0x00b67a9c
00b67914	bl 0x00c342a0
00b67918	adrp x0,0x2ac000
00b6791c	adrp x2,0x2ba000
00b67920	add x0,x0,#0xc00
00b67924	add x2,x2,#0xb96
00b67928	mov w1,#0x101
00b6792c	b 0x00b67a9c
00b67930	ldr x9,[x19, #0x10]
00b67934	cmp x9,x8
00b67938	b.eq 0x00b67950
00b6793c	ldr w9,[x19, #0x50]
00b67940	cbz w9,0x00b6794c
00b67944	orr w9,wzr,#0x3
00b67948	str w9,[x19, #0x50]
00b6794c	str x8,[x19, #0x10]
00b67950	adrp x1,0x2c3000
00b67954	add x1,x1,#0x9c2
00b67958	mov x0,x20
00b6795c	bl 0x00c36530
00b67960	cbz x0,0x00b67a24
00b67964	ldr w8,[x0, #0x8]
00b67968	cmp w8,#0x5
00b6796c	b.ne 0x00b679ec
00b67970	ldp x21,x22,[x0, #0x10]
00b67974	bl 0x00c41000
00b67978	cmp x22,#0xd
00b6797c	b.ne 0x00b679c0
00b67980	cbz w0,0x00b679c0
00b67984	ldur x8,[x21, #0x5]
00b67988	mov w11,#0xd
00b6798c	stur x8,[x19, #0xda]
00b67990	ldrb w10,[x19, #0xe0]
00b67994	ldrb w9,[x19, #0xe1]
00b67998	ldr x8,[x21]
00b6799c	str x11,[x19, #0x28]
00b679a0	bfm x9,x10,#0x38,#0x7
00b679a4	stur x8,[x19, #0xd5]
00b679a8	subs x8,x9,#0x8
00b679ac	b.cc 0x00b679c0
00b679b0	ldrb w10,[x19, #0x54]
00b679b4	tbnz w10,#0x0,0x00b67a0c
00b679b8	cmp x8,#0x10
00b679bc	b.cs 0x00b67a08
00b679c0	str xzr,[sp, #0x18]
00b679c4	bl 0x00c342a0
00b679c8	adrp x0,0x2ac000
00b679cc	adrp x2,0x2ba000
00b679d0	add x0,x0,#0xc00
00b679d4	add x2,x2,#0xb96
00b679d8	mov w1,#0x118
00b679dc	bl 0x00c342b0
00b679e0	mov w0,#0x39
00b679e4	mov w1,#0x6c
00b679e8	b 0x00b67aa8
00b679ec	bl 0x00c342a0
00b679f0	adrp x0,0x2ac000
00b679f4	adrp x2,0x2ba000
00b679f8	add x0,x0,#0xc00
00b679fc	add x2,x2,#0xb96
00b67a00	mov w1,#0x113
00b67a04	b 0x00b67a9c
00b67a08	sub x8,x9,#0x18
00b67a0c	lsr x9,x8,#0x8
00b67a10	strb w8,[x19, #0xe1]
00b67a14	mov w8,#0x10
00b67a18	strb w9,[x19, #0xe0]
00b67a1c	str x8,[sp, #0x18]
00b67a20	str x8,[x19, #0x20]
00b67a24	adrp x1,0x2d7000
00b67a28	add x1,x1,#0xec0
00b67a2c	mov x0,x20
00b67a30	bl 0x00c36530
00b67a34	cbz x0,0x00b67adc
00b67a38	ldr w8,[x0, #0x8]
00b67a3c	cmp w8,#0x5
00b67a40	b.ne 0x00b67a84
00b67a44	ldp x1,x21,[x0, #0x10]
00b67a48	cmn x21,#0x1
00b67a4c	b.eq 0x00b67ab8
00b67a50	cmp x21,#0x4
00b67a54	b.cc 0x00b67a68
00b67a58	ldr x23,[x19, #0x10]
00b67a5c	sub x8,x23,w21, SXTW 
00b67a60	cmp x8,#0x8
00b67a64	b.cs 0x00b67b84
00b67a68	bl 0x00c342a0
00b67a6c	adrp x0,0x2ac000
00b67a70	adrp x2,0x2ba000
00b67a74	add x0,x0,#0xc00
00b67a78	add x2,x2,#0xb96
00b67a7c	mov w1,#0x125
00b67a80	b 0x00b67a9c
00b67a84	bl 0x00c342a0
00b67a88	adrp x0,0x2ac000
00b67a8c	adrp x2,0x2ba000
00b67a90	add x0,x0,#0xc00
00b67a94	add x2,x2,#0xb96
00b67a98	mov w1,#0x121
00b67a9c	bl 0x00c342b0
00b67aa0	mov w0,#0x39
00b67aa4	mov w1,#0x67
00b67aa8	mov x2,xzr
00b67aac	bl 0x00c342c0
00b67ab0	mov w0,wzr
00b67ab4	b 0x00b67b64
00b67ab8	ldr x2,[x19, #0x10]
00b67abc	add x0,x19,#0x55
00b67ac0	bl 0x00c2ffd0
00b67ac4	add x22,x19,#0x54
00b67ac8	ldrb w8,[x22]
00b67acc	orr w8,w8,#0x10
00b67ad0	mov w9,#0x1
00b67ad4	strb w8,[x19, #0x54]
00b67ad8	str w9,[x19, #0x50]
00b67adc	adrp x1,0x2a0000
00b67ae0	add x1,x1,#0x23d
00b67ae4	mov x0,x20
00b67ae8	bl 0x00c36530
00b67aec	cbz x0,0x00b67b60
00b67af0	ldr x1,[x0, #0x10]
00b67af4	mov x8,x0
00b67af8	cbz x1,0x00b67b7c
00b67afc	ldr w9,[x8, #0x8]
00b67b00	mov w0,wzr
00b67b04	cmp w9,#0x5
00b67b08	b.ne 0x00b67b64
00b67b0c	ldrb w9,[x19, #0x54]
00b67b10	mov w10,#0x15
00b67b14	mov w0,wzr
00b67b18	and w9,w9,w10
00b67b1c	cmp w9,#0x14
00b67b20	b.ne 0x00b67b64
00b67b24	ldr x9,[x19, #0x10]
00b67b28	ldr x2,[x8, #0x18]
00b67b2c	add x20,x19,#0x55
00b67b30	add x8,x20,x9
00b67b34	sub x0,x8,x2
00b67b38	bl 0x00c2ffd0
00b67b3c	ldr x8,[x19, #0xf0]
00b67b40	ldr x2,[x19, #0x10]
00b67b44	mov x0,x19
00b67b48	mov x1,x20
00b67b4c	ldr x8,[x8, #0x8]
00b67b50	blr x8
00b67b54	cbz w0,0x00b67b64
00b67b58	mov w8,#0x2
00b67b5c	str w8,[x19, #0x50]
00b67b60	mov w0,#0x1
00b67b64	ldp x29,x30,[sp, #0x40]
00b67b68	ldp x20,x19,[sp, #0x30]
00b67b6c	ldp x22,x21,[sp, #0x20]
00b67b70	ldr x23,[sp, #0x10]
00b67b74	add sp,sp,#0x50
00b67b78	ret
00b67b7c	mov w0,wzr
00b67b80	b 0x00b67b64
00b67b84	add x0,x19,#0x55
00b67b88	mov x2,x21
00b67b8c	bl 0x00c2ffd0
00b67b90	mov x22,x19
00b67b94	ldrb w8,[x22, #0x54]!
00b67b98	tbz w8,#0x0,0x00b67acc
00b67b9c	ldr x0,[x19, #0xe8]
00b67ba0	add x8,x19,x21
00b67ba4	add x1,x8,#0x55
00b67ba8	sub x2,x23,x21
00b67bac	mov w3,wzr
00b67bb0	bl 0x00c347b0
00b67bb4	cmp w0,#0x0
00b67bb8	b.gt 0x00b67ac8
00b67bbc	b 0x00b67a68

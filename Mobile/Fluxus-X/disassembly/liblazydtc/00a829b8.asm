; ossl_namemap_add_names @ 00a829b8
00a829b8	sub sp,sp,#0x70
00a829bc	stp x28,x27,[sp, #0x10]
00a829c0	stp x26,x25,[sp, #0x20]
00a829c4	stp x24,x23,[sp, #0x30]
00a829c8	stp x22,x21,[sp, #0x40]
00a829cc	stp x20,x19,[sp, #0x50]
00a829d0	stp x29,x30,[sp, #0x60]
00a829d4	add x29,sp,#0x60
00a829d8	cbz x0,0x00a82b4c
00a829dc	mov x19,x0
00a829e0	ldr x0,[x0, #0x8]
00a829e4	mov w22,w3
00a829e8	mov x21,x2
00a829ec	mov w20,w1
00a829f0	bl 0x00c356a0
00a829f4	cbz w0,0x00a82c4c
00a829f8	ldrb w8,[x21]
00a829fc	cbz w8,0x00a82b80
00a82a00	adrp x25,0x2bd000
00a82a04	and w24,w22,#0xff
00a82a08	add x25,x25,#0xc0d
00a82a0c	mov x23,x21
00a82a10	mov x0,x23
00a82a14	mov w1,w24
00a82a18	bl 0x00c30890
00a82a1c	mov x27,x0
00a82a20	cbz x0,0x00a82a2c
00a82a24	sub x26,x27,x23
00a82a28	b 0x00a82a38
00a82a2c	mov x0,x23
00a82a30	bl 0x00c2ff50
00a82a34	mov x26,x0
00a82a38	mov w3,#0xb6
00a82a3c	mov x0,x23
00a82a40	mov x1,x26
00a82a44	mov x2,x25
00a82a48	bl 0x00c36180
00a82a4c	str x0,[sp]
00a82a50	cbz x0,0x00a82aa8
00a82a54	str wzr,[sp, #0x8]
00a82a58	ldr x0,[x19, #0x10]
00a82a5c	mov x1,sp
00a82a60	bl 0x00c34de0
00a82a64	ldr x8,[sp]
00a82a68	mov x28,x0
00a82a6c	mov w2,#0xbb
00a82a70	mov x1,x25
00a82a74	mov x0,x8
00a82a78	bl 0x00c32310
00a82a7c	cbz x28,0x00a82a84
00a82a80	ldr w28,[x28, #0x8]
00a82a84	ldrb w8,[x23]
00a82a88	cbz w8,0x00a82b90
00a82a8c	cmp w8,w22, UXTB 
00a82a90	b.eq 0x00a82b90
00a82a94	cbz w20,0x00a82ab8
00a82a98	cbz w28,0x00a82abc
00a82a9c	cmp w28,w20
00a82aa0	b.eq 0x00a82abc
00a82aa4	b 0x00a82bc0
00a82aa8	mov w28,wzr
00a82aac	ldrb w8,[x23]
00a82ab0	cbnz w8,0x00a82a8c
00a82ab4	b 0x00a82b90
00a82ab8	mov w20,w28
00a82abc	add x8,x23,x26
00a82ac0	cmp x27,#0x0
00a82ac4	csinc x23,x8,x27,eq
00a82ac8	ldrb w8,[x23]
00a82acc	cbnz w8,0x00a82a10
00a82ad0	ldrb w8,[x21]
00a82ad4	cbz w8,0x00a82b80
00a82ad8	and w23,w22,#0xff
00a82adc	mov x0,x21
00a82ae0	mov w1,w23
00a82ae4	bl 0x00c30890
00a82ae8	mov x24,x0
00a82aec	cbz x0,0x00a82af8
00a82af0	sub x25,x24,x21
00a82af4	b 0x00a82b04
00a82af8	mov x0,x21
00a82afc	bl 0x00c2ff50
00a82b00	mov x25,x0
00a82b04	mov x0,x19
00a82b08	mov w1,w20
00a82b0c	mov x2,x21
00a82b10	mov x3,x25
00a82b14	bl 0x00a827e8
00a82b18	mov w22,w0
00a82b1c	cbz w20,0x00a82b30
00a82b20	cmp w22,w20
00a82b24	b.ne 0x00a82c04
00a82b28	mov w22,w20
00a82b2c	b 0x00a82b34
00a82b30	mov w20,w22
00a82b34	add x8,x21,x25
00a82b38	cmp x24,#0x0
00a82b3c	csinc x21,x8,x24,eq
00a82b40	ldrb w8,[x21]
00a82b44	cbnz w8,0x00a82adc
00a82b48	b 0x00a82b84
00a82b4c	bl 0x00c342a0
00a82b50	adrp x0,0x2bd000
00a82b54	adrp x2,0x2b5000
00a82b58	add x0,x0,#0xc0d
00a82b5c	add x2,x2,#0xd70
00a82b60	mov w1,#0x137
00a82b64	bl 0x00c342b0
00a82b68	mov w1,#0x102
00a82b6c	orr w0,wzr,#0xf
00a82b70	movk w1,#0xc, LSL #16
00a82b74	mov x2,xzr
00a82b78	bl 0x00c342c0
00a82b7c	b 0x00a82c4c
00a82b80	mov w22,w20
00a82b84	ldr x0,[x19, #0x8]
00a82b88	bl 0x00c35690
00a82b8c	b 0x00a82c50
00a82b90	bl 0x00c342a0
00a82b94	adrp x0,0x2bd000
00a82b98	adrp x2,0x2b5000
00a82b9c	add x0,x0,#0xc0d
00a82ba0	add x2,x2,#0xd70
00a82ba4	mov w1,#0x14c
00a82ba8	bl 0x00c342b0
00a82bac	orr w0,wzr,#0xf
00a82bb0	mov w1,#0x75
00a82bb4	mov x2,xzr
00a82bb8	bl 0x00c342c0
00a82bbc	b 0x00a82c44
00a82bc0	bl 0x00c342a0
00a82bc4	adrp x0,0x2bd000
00a82bc8	adrp x2,0x2b5000
00a82bcc	add x0,x0,#0xc0d
00a82bd0	add x2,x2,#0xd70
00a82bd4	mov w1,#0x152
00a82bd8	bl 0x00c342b0
00a82bdc	adrp x2,0x2dc000
00a82be0	add x2,x2,#0xca
00a82be4	orr w0,wzr,#0xf
00a82be8	mov w1,#0x76
00a82bec	mov x3,x26
00a82bf0	mov x4,x23
00a82bf4	mov w5,w28
00a82bf8	mov x6,x21
00a82bfc	bl 0x00c342c0
00a82c00	b 0x00a82c44
00a82c04	bl 0x00c342a0
00a82c08	adrp x0,0x2bd000
00a82c0c	adrp x2,0x2b5000
00a82c10	add x0,x0,#0xc0d
00a82c14	add x2,x2,#0xd70
00a82c18	mov w1,#0x166
00a82c1c	bl 0x00c342b0
00a82c20	mov w8,#0x102
00a82c24	movk w8,#0xc, LSL #16
00a82c28	adrp x2,0x2b9000
00a82c2c	add w1,w8,#0x1
00a82c30	add x2,x2,#0xf83
00a82c34	orr w0,wzr,#0xf
00a82c38	mov w3,w22
00a82c3c	mov w4,w20
00a82c40	bl 0x00c342c0
00a82c44	ldr x0,[x19, #0x8]
00a82c48	bl 0x00c35690
00a82c4c	mov w22,wzr
00a82c50	mov w0,w22
00a82c54	ldp x29,x30,[sp, #0x60]
00a82c58	ldp x20,x19,[sp, #0x50]
00a82c5c	ldp x22,x21,[sp, #0x40]
00a82c60	ldp x24,x23,[sp, #0x30]
00a82c64	ldp x26,x25,[sp, #0x20]
00a82c68	ldp x28,x27,[sp, #0x10]
00a82c6c	add sp,sp,#0x70
00a82c70	ret

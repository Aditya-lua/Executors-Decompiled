; EC_GROUP_set_generator @ 00a30a58
00a30a58	str x23,[sp, #-0x40]!
00a30a5c	stp x22,x21,[sp, #0x10]
00a30a60	stp x20,x19,[sp, #0x20]
00a30a64	stp x29,x30,[sp, #0x30]
00a30a68	add x29,sp,#0x30
00a30a6c	cbz x1,0x00a30ac4
00a30a70	mov x19,x0
00a30a74	ldr x0,[x0, #0x40]
00a30a78	cbz x0,0x00a30a9c
00a30a7c	mov x20,x3
00a30a80	mov x21,x2
00a30a84	mov x22,x1
00a30a88	bl 0x00c369b0
00a30a8c	cbnz w0,0x00a30a9c
00a30a90	ldr x0,[x19, #0x40]
00a30a94	bl 0x00c37f40
00a30a98	cbz w0,0x00a30b10
00a30a9c	bl 0x00c342a0
00a30aa0	adrp x0,0x29e000
00a30aa4	adrp x2,0x2db000
00a30aa8	add x0,x0,#0xa7
00a30aac	add x2,x2,#0xef6
00a30ab0	mov w1,#0x176
00a30ab4	bl 0x00c342b0
00a30ab8	mov w0,#0x10
00a30abc	mov w1,#0x67
00a30ac0	b 0x00a30aec
00a30ac4	bl 0x00c342a0
00a30ac8	adrp x0,0x29e000
00a30acc	adrp x2,0x2db000
00a30ad0	add x0,x0,#0xa7
00a30ad4	add x2,x2,#0xef6
00a30ad8	mov w1,#0x16f
00a30adc	bl 0x00c342b0
00a30ae0	mov w1,#0x102
00a30ae4	mov w0,#0x10
00a30ae8	movk w1,#0xc, LSL #16
00a30aec	mov x2,xzr
00a30af0	bl 0x00c342c0
00a30af4	mov w21,wzr
00a30af8	mov w0,w21
00a30afc	ldp x29,x30,[sp, #0x30]
00a30b00	ldp x20,x19,[sp, #0x20]
00a30b04	ldp x22,x21,[sp, #0x10]
00a30b08	ldr x23,[sp], #0x40
00a30b0c	ret
00a30b10	cbz x21,0x00a30b50
00a30b14	mov x0,x21
00a30b18	bl 0x00c369b0
00a30b1c	cbnz w0,0x00a30b50
00a30b20	mov x0,x21
00a30b24	bl 0x00c37f40
00a30b28	cbnz w0,0x00a30b50
00a30b2c	mov x0,x21
00a30b30	bl 0x00c322f0
00a30b34	ldr x8,[x19, #0x40]
00a30b38	mov w23,w0
00a30b3c	mov x0,x8
00a30b40	bl 0x00c322f0
00a30b44	add w8,w0,#0x1
00a30b48	cmp w23,w8
00a30b4c	b.le 0x00a30b78
00a30b50	bl 0x00c342a0
00a30b54	adrp x0,0x29e000
00a30b58	adrp x2,0x2db000
00a30b5c	add x0,x0,#0xa7
00a30b60	add x2,x2,#0xef6
00a30b64	mov w1,#0x181
00a30b68	bl 0x00c342b0
00a30b6c	mov w0,#0x10
00a30b70	mov w1,#0x7a
00a30b74	b 0x00a30aec
00a30b78	cbz x20,0x00a30bb0
00a30b7c	mov x0,x20
00a30b80	bl 0x00c37f40
00a30b84	cbz w0,0x00a30bb0
00a30b88	bl 0x00c342a0
00a30b8c	adrp x0,0x29e000
00a30b90	adrp x2,0x2db000
00a30b94	add x0,x0,#0xa7
00a30b98	add x2,x2,#0xef6
00a30b9c	mov w1,#0x18b
00a30ba0	bl 0x00c342b0
00a30ba4	mov w0,#0x10
00a30ba8	mov w1,#0xa4
00a30bac	b 0x00a30aec
00a30bb0	ldr x0,[x19, #0x8]
00a30bb4	cbnz x0,0x00a30bc8
00a30bb8	mov x0,x19
00a30bbc	bl 0x00a3081c
00a30bc0	str x0,[x19, #0x8]
00a30bc4	cbz x0,0x00a30af4
00a30bc8	mov x1,x22
00a30bcc	bl 0x00a30938
00a30bd0	cbz w0,0x00a30af4
00a30bd4	ldr x0,[x19, #0x10]
00a30bd8	mov x1,x21
00a30bdc	bl 0x00c36990
00a30be0	cbz x0,0x00a30af4
00a30be4	cbz x20,0x00a30bf4
00a30be8	mov x0,x20
00a30bec	bl 0x00c369b0
00a30bf0	cbz w0,0x00a30c90
00a30bf4	ldr x0,[x19, #0x10]
00a30bf8	bl 0x00c322f0
00a30bfc	ldr x8,[x19, #0x40]
00a30c00	mov w20,w0
00a30c04	mov x0,x8
00a30c08	bl 0x00c322f0
00a30c0c	add w8,w0,#0x1
00a30c10	add w9,w0,#0x2
00a30c14	cmp w8,#0x0
00a30c18	csinc w8,w9,w0,lt
00a30c1c	asr w8,w8,#0x1
00a30c20	add w8,w8,#0x3
00a30c24	cmp w20,w8
00a30c28	b.le 0x00a30c84
00a30c2c	ldr x0,[x19, #0xa8]
00a30c30	bl 0x00c38a60
00a30c34	cbz x0,0x00a30da0
00a30c38	mov x20,x0
00a30c3c	bl 0x00c38a90
00a30c40	mov x0,x20
00a30c44	bl 0x00c38a40
00a30c48	cbz x0,0x00a30d90
00a30c4c	ldr x8,[x19]
00a30c50	mov x21,x0
00a30c54	ldr w8,[x8, #0x4]
00a30c58	cmp w8,#0x197
00a30c5c	b.ne 0x00a30d14
00a30c60	mov x0,x21
00a30c64	bl 0x00c38e00
00a30c68	ldr x0,[x19, #0x40]
00a30c6c	bl 0x00c322f0
00a30c70	sub w1,w0,#0x1
00a30c74	mov x0,x21
00a30c78	bl 0x00c38db0
00a30c7c	cbnz w0,0x00a30d24
00a30c80	b 0x00a30d90
00a30c84	ldr x0,[x19, #0x18]
00a30c88	bl 0x00c38e00
00a30c8c	b 0x00a30ca0
00a30c90	ldr x0,[x19, #0x18]
00a30c94	mov x1,x20
00a30c98	bl 0x00c36990
00a30c9c	cbz x0,0x00a30af4
00a30ca0	ldr x0,[x19, #0x10]
00a30ca4	bl 0x00c38d10
00a30ca8	cbz w0,0x00a30cf0
00a30cac	ldr x0,[x19, #0xa8]
00a30cb0	bl 0x00c38a60
00a30cb4	ldr x8,[x19, #0x90]
00a30cb8	mov x20,x0
00a30cbc	mov x0,x8
00a30cc0	bl 0x00c38f70
00a30cc4	str xzr,[x19, #0x90]
00a30cc8	cbz x20,0x00a30d04
00a30ccc	bl 0x00c38f80
00a30cd0	str x0,[x19, #0x90]
00a30cd4	cbz x0,0x00a30d04
00a30cd8	ldr x1,[x19, #0x10]
00a30cdc	mov x2,x20
00a30ce0	bl 0x00c38f90
00a30ce4	cbz w0,0x00a30dac
00a30ce8	mov w21,#0x1
00a30cec	b 0x00a30d08
00a30cf0	ldr x0,[x19, #0x90]
00a30cf4	bl 0x00c38f70
00a30cf8	mov w21,#0x1
00a30cfc	str xzr,[x19, #0x90]
00a30d00	b 0x00a30af8
00a30d04	mov w21,wzr
00a30d08	mov x0,x20
00a30d0c	bl 0x00c38a30
00a30d10	b 0x00a30af8
00a30d14	ldr x1,[x19, #0x40]
00a30d18	mov x0,x21
00a30d1c	bl 0x00c36990
00a30d20	cbz x0,0x00a30d90
00a30d24	ldp x1,x0,[x19, #0x10]
00a30d28	bl 0x00c39080
00a30d2c	cbz w0,0x00a30d90
00a30d30	ldr x0,[x19, #0x18]
00a30d34	mov x2,x21
00a30d38	mov x1,x0
00a30d3c	bl 0x00c38870
00a30d40	cbz w0,0x00a30d90
00a30d44	ldr x21,[x19, #0x18]
00a30d48	bl 0x00c38de0
00a30d4c	mov x2,x0
00a30d50	mov x0,x21
00a30d54	mov x1,x21
00a30d58	bl 0x00c38870
00a30d5c	cbz w0,0x00a30d90
00a30d60	ldp x3,x0,[x19, #0x10]
00a30d64	mov x1,xzr
00a30d68	mov x4,x20
00a30d6c	mov x2,x0
00a30d70	bl 0x00c38ab0
00a30d74	mov w21,w0
00a30d78	mov x0,x20
00a30d7c	bl 0x00c38a20
00a30d80	mov x0,x20
00a30d84	bl 0x00c38a30
00a30d88	cbnz w21,0x00a30ca0
00a30d8c	b 0x00a30da0
00a30d90	mov x0,x20
00a30d94	bl 0x00c38a20
00a30d98	mov x0,x20
00a30d9c	bl 0x00c38a30
00a30da0	ldr x0,[x19, #0x18]
00a30da4	bl 0x00c38e00
00a30da8	b 0x00a30af4
00a30dac	ldr x0,[x19, #0x90]
00a30db0	bl 0x00c38f70
00a30db4	mov w21,wzr
00a30db8	str xzr,[x19, #0x90]
00a30dbc	b 0x00a30d08

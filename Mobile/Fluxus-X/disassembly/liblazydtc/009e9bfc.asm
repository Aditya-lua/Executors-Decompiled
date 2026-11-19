; tls_process_client_key_exchange @ 009e9bfc
009e9bfc	stp x28,x25,[sp, #-0x50]!
009e9c00	stp x24,x23,[sp, #0x10]
009e9c04	stp x22,x21,[sp, #0x20]
009e9c08	stp x20,x19,[sp, #0x30]
009e9c0c	stp x29,x30,[sp, #0x40]
009e9c10	add x29,sp,#0x40
009e9c14	sub sp,sp,#0x230
009e9c18	ldr x8,[x0, #0x2e0]
009e9c1c	mov x19,x0
009e9c20	mov x20,x1
009e9c24	ldr w24,[x8, #0x1c]
009e9c28	mov w8,#0x1c8
009e9c2c	tst x24,x8
009e9c30	b.eq 0x009e9dd4
009e9c34	ldr x8,[x20, #0x8]
009e9c38	subs x8,x8,#0x2
009e9c3c	b.cc 0x009e9c58
009e9c40	ldr x9,[x20]
009e9c44	ldrb w10,[x9]
009e9c48	ldrb w21,[x9, #0x1]
009e9c4c	bfm x21,x10,#0x38,#0x7
009e9c50	subs x8,x8,x21
009e9c54	b.cs 0x009e9c74
009e9c58	bl 0x00c342a0
009e9c5c	adrp x0,0x2bd000
009e9c60	adrp x2,0x2db000
009e9c64	add x0,x0,#0x74c
009e9c68	add x2,x2,#0xd04
009e9c6c	mov w1,#0xaf6
009e9c70	b 0x009e9f74
009e9c74	add x22,x9,#0x2
009e9c78	cmp x21,#0x101
009e9c7c	add x9,x22,x21
009e9c80	stp x9,x8,[x20]
009e9c84	b.cc 0x009e9cb0
009e9c88	bl 0x00c342a0
009e9c8c	adrp x0,0x2bd000
009e9c90	adrp x2,0x2db000
009e9c94	add x0,x0,#0x74c
009e9c98	add x2,x2,#0xd04
009e9c9c	mov w1,#0xafa
009e9ca0	bl 0x00c342b0
009e9ca4	mov w1,#0x32
009e9ca8	mov w2,#0x92
009e9cac	b 0x009e9f80
009e9cb0	ldr x8,[x19, #0x990]
009e9cb4	cbz x8,0x009e9d30
009e9cb8	ldr x25,[x19, #0x918]
009e9cbc	adrp x23,0x2d1000
009e9cc0	add x23,x23,#0x573
009e9cc4	mov w2,#0x1e3
009e9cc8	ldr x0,[x25, #0x2a8]
009e9ccc	mov x1,x23
009e9cd0	bl 0x00c32310
009e9cd4	mov w3,#0x1e6
009e9cd8	mov x0,x22
009e9cdc	mov x1,x21
009e9ce0	mov x2,x23
009e9ce4	bl 0x00c36180
009e9ce8	str x0,[x25, #0x2a8]
009e9cec	cbz x0,0x009e9d58
009e9cf0	ldr x8,[x19, #0x918]
009e9cf4	ldr x9,[x19, #0x990]
009e9cf8	mov x2,sp
009e9cfc	mov w3,#0x200
009e9d00	ldr x1,[x8, #0x2a8]
009e9d04	mov x0,x19
009e9d08	blr x9
009e9d0c	cmp w0,#0x201
009e9d10	b.cc 0x009e9d84
009e9d14	bl 0x00c342a0
009e9d18	adrp x0,0x2bd000
009e9d1c	adrp x2,0x2db000
009e9d20	add x0,x0,#0x74c
009e9d24	add x2,x2,#0xd04
009e9d28	mov w1,#0xb0b
009e9d2c	b 0x009e9d70
009e9d30	bl 0x00c342a0
009e9d34	adrp x0,0x2bd000
009e9d38	adrp x2,0x2db000
009e9d3c	add x0,x0,#0x74c
009e9d40	add x2,x2,#0xd04
009e9d44	mov w1,#0xafe
009e9d48	bl 0x00c342b0
009e9d4c	mov w1,#0x50
009e9d50	mov w2,#0xe1
009e9d54	b 0x009e9f80
009e9d58	bl 0x00c342a0
009e9d5c	adrp x0,0x2bd000
009e9d60	adrp x2,0x2db000
009e9d64	add x0,x0,#0x74c
009e9d68	add x2,x2,#0xd04
009e9d6c	mov w1,#0xb03
009e9d70	bl 0x00c342b0
009e9d74	mov w2,#0x103
009e9d78	mov w1,#0x50
009e9d7c	movk w2,#0xc, LSL #16
009e9d80	b 0x009e9f80
009e9d84	mov w21,w0
009e9d88	cbz w21,0x009ea298
009e9d8c	ldr x0,[x19, #0x370]
009e9d90	adrp x22,0x2bd000
009e9d94	add x22,x22,#0x74c
009e9d98	mov w2,#0xb15
009e9d9c	mov x1,x22
009e9da0	bl 0x00c32310
009e9da4	mov x0,sp
009e9da8	mov w3,#0xb16
009e9dac	mov x1,x21
009e9db0	mov x2,x22
009e9db4	bl 0x00c345f0
009e9db8	str x0,[x19, #0x370]
009e9dbc	mov x0,sp
009e9dc0	mov x1,x21
009e9dc4	bl 0x00c34750
009e9dc8	ldr x8,[x19, #0x370]
009e9dcc	cbz x8,0x009ea354
009e9dd0	str x21,[x19, #0x378]
009e9dd4	tbnz w24,#0x3,0x009e9f54
009e9dd8	mov w8,#0x41
009e9ddc	tst x24,x8
009e9de0	b.eq 0x009e9fcc
009e9de4	ldr x8,[x19, #0x898]
009e9de8	ldr x21,[x8, #0x28]
009e9dec	cbz x21,0x009ea094
009e9df0	ldr w8,[x19]
009e9df4	orr w8,w8,#0x200
009e9df8	cmp w8,#0x300
009e9dfc	b.ne 0x009ea148
009e9e00	ldp x23,x22,[x20]
009e9e04	adrp x1,0x2bd000
009e9e08	orr w8,wzr,#0x30
009e9e0c	add x1,x1,#0x74c
009e9e10	orr w0,wzr,#0x30
009e9e14	mov w2,#0xb45
009e9e18	stur x8,[x29, #-0x48]
009e9e1c	bl 0x00c32320
009e9e20	cbz x0,0x009ea198
009e9e24	ldr x8,[x19, #0x9a8]
009e9e28	mov x20,x0
009e9e2c	mov x1,x21
009e9e30	ldr x0,[x8]
009e9e34	ldr x2,[x8, #0x440]
009e9e38	bl 0x00c34640
009e9e3c	cbz x0,0x009ea1e4
009e9e40	mov x21,x0
009e9e44	bl 0x00c37330
009e9e48	cmp w0,#0x1
009e9e4c	b.lt 0x009ea1c8
009e9e50	orr w1,wzr,#0x7
009e9e54	mov x0,x21
009e9e58	bl 0x00c37100
009e9e5c	cmp w0,#0x0
009e9e60	b.le 0x009ea1c8
009e9e64	adrp x0,0x2cd000
009e9e68	mov x25,sp
009e9e6c	add x1,x19,#0xa0c
009e9e70	add x0,x0,#0x7da
009e9e74	sub x8,x29,#0x70
009e9e78	add x24,x25,#0x28
009e9e7c	bl 0x00c37340
009e9e80	ldur x8,[x29, #-0x50]
009e9e84	ldp q1,q0,[x29, #-0x70]
009e9e88	str x8,[sp, #0x20]
009e9e8c	stp q1,q0,[sp]
009e9e90	ldrb w8,[x19, #0x9ea]
009e9e94	tbz w8,#0x7,0x009e9ec4
009e9e98	adrp x0,0x2bd000
009e9e9c	add x0,x0,#0x788
009e9ea0	sub x8,x29,#0x70
009e9ea4	mov x1,x19
009e9ea8	add x25,x25,#0x50
009e9eac	bl 0x00c37340
009e9eb0	ldur x8,[x29, #-0x50]
009e9eb4	ldp q0,q1,[x29, #-0x70]
009e9eb8	str x8,[x24, #0x20]
009e9ebc	stp q0,q1,[x24]
009e9ec0	mov x24,x25
009e9ec4	sub x8,x29,#0x70
009e9ec8	bl 0x00c34c40
009e9ecc	ldur x8,[x29, #-0x50]
009e9ed0	ldp q0,q1,[x29, #-0x70]
009e9ed4	mov x1,sp
009e9ed8	mov x0,x21
009e9edc	str x8,[x24, #0x20]
009e9ee0	stp q0,q1,[x24]
009e9ee4	bl 0x00c36dd0
009e9ee8	cbz w0,0x009ea314
009e9eec	sub x2,x29,#0x48
009e9ef0	mov x0,x21
009e9ef4	mov x1,x20
009e9ef8	mov x3,x23
009e9efc	mov x4,x22
009e9f00	bl 0x00c37320
009e9f04	cmp w0,#0x0
009e9f08	b.le 0x009ea314
009e9f0c	ldur x8,[x29, #-0x48]
009e9f10	cmp x8,#0x30
009e9f14	b.ne 0x009ea464
009e9f18	orr w2,wzr,#0x30
009e9f1c	mov x0,x19
009e9f20	mov x1,x20
009e9f24	mov w3,wzr
009e9f28	bl 0x00c349b0
009e9f2c	adrp x1,0x2bd000
009e9f30	mov w22,w0
009e9f34	add x1,x1,#0x74c
009e9f38	mov w2,#0xb85
009e9f3c	mov x0,x20
009e9f40	bl 0x00c32310
009e9f44	mov x0,x21
009e9f48	bl 0x00c34620
009e9f4c	cbnz w22,0x009ea08c
009e9f50	b 0x009e9f8c
009e9f54	ldr x8,[x20, #0x8]
009e9f58	cbz x8,0x009ea074
009e9f5c	bl 0x00c342a0
009e9f60	adrp x0,0x2bd000
009e9f64	adrp x2,0x2db000
009e9f68	add x0,x0,#0x74c
009e9f6c	add x2,x2,#0xce4
009e9f70	mov w1,#0xce0
009e9f74	bl 0x00c342b0
009e9f78	mov w1,#0x32
009e9f7c	mov w2,#0x9f
009e9f80	mov x0,x19
009e9f84	mov x3,xzr
009e9f88	bl 0x00c34410
009e9f8c	ldr x0,[x19, #0x370]
009e9f90	ldr x1,[x19, #0x378]
009e9f94	adrp x2,0x2bd000
009e9f98	add x2,x2,#0x74c
009e9f9c	mov w3,#0xd0e
009e9fa0	bl 0x00c345e0
009e9fa4	mov w0,wzr
009e9fa8	str xzr,[x19, #0x378]
009e9fac	str xzr,[x19, #0x370]
009e9fb0	add sp,sp,#0x230
009e9fb4	ldp x29,x30,[sp, #0x40]
009e9fb8	ldp x20,x19,[sp, #0x30]
009e9fbc	ldp x22,x21,[sp, #0x20]
009e9fc0	ldp x24,x23,[sp, #0x10]
009e9fc4	ldp x28,x25,[sp], #0x50
009e9fc8	ret
009e9fcc	mov w8,#0x102
009e9fd0	tst x24,x8
009e9fd4	b.eq 0x009ea0e4
009e9fd8	ldr x8,[x20, #0x8]
009e9fdc	subs x8,x8,#0x2
009e9fe0	b.cc 0x009ea0bc
009e9fe4	ldr x9,[x20]
009e9fe8	ldrb w10,[x9]
009e9fec	ldrb w22,[x9, #0x1]
009e9ff0	add x23,x9,#0x2
009e9ff4	stp x23,x8,[x20]
009e9ff8	bfm x22,x10,#0x38,#0x7
009e9ffc	cmp x8,x22
009ea000	b.ne 0x009ea0bc
009ea004	ldr x21,[x19, #0x2e8]
009ea008	cbz x21,0x009ea330
009ea00c	cbz x22,0x009ea390
009ea010	add x8,x23,x22
009ea014	stp x8,xzr,[x20]
009ea018	bl 0x00c36450
009ea01c	mov x20,x0
009ea020	cbz x0,0x009ea374
009ea024	mov x0,x20
009ea028	mov x1,x21
009ea02c	bl 0x00c32440
009ea030	cbz w0,0x009ea374
009ea034	mov x0,x20
009ea038	mov x1,x23
009ea03c	mov x2,x22
009ea040	bl 0x00c36460
009ea044	cbnz w0,0x009ea430
009ea048	bl 0x00c342a0
009ea04c	adrp x0,0x2bd000
009ea050	adrp x2,0x2b7000
009ea054	add x0,x0,#0x74c
009ea058	add x2,x2,#0x87e
009ea05c	mov w1,#0xbac
009ea060	bl 0x00c342b0
009ea064	mov w2,#0x103
009ea068	mov w1,#0x50
009ea06c	movk w2,#0xc, LSL #16
009ea070	b 0x009ea758
009ea074	mov x0,x19
009ea078	mov x1,xzr
009ea07c	mov x2,xzr
009ea080	mov w3,wzr
009ea084	bl 0x00c349b0
009ea088	cbz w0,0x009e9f8c
009ea08c	mov w0,#0x2
009ea090	b 0x009e9fb0
009ea094	bl 0x00c342a0
009ea098	adrp x0,0x2bd000
009ea09c	adrp x2,0x2a2000
009ea0a0	add x0,x0,#0x74c
009ea0a4	add x2,x2,#0xff
009ea0a8	mov w1,#0xb35
009ea0ac	bl 0x00c342b0
009ea0b0	mov w1,#0x50
009ea0b4	mov w2,#0xa8
009ea0b8	b 0x009e9f80
009ea0bc	bl 0x00c342a0
009ea0c0	adrp x0,0x2bd000
009ea0c4	adrp x2,0x2b7000
009ea0c8	add x0,x0,#0x74c
009ea0cc	add x2,x2,#0x87e
009ea0d0	mov w1,#0xb93
009ea0d4	bl 0x00c342b0
009ea0d8	mov w1,#0x32
009ea0dc	mov w2,#0x94
009ea0e0	b 0x009ea3b4
009ea0e4	mov w8,#0x84
009ea0e8	tst x24,x8
009ea0ec	b.eq 0x009ea23c
009ea0f0	ldr x8,[x20, #0x8]
009ea0f4	cbz x8,0x009ea270
009ea0f8	ldr x22,[x20]
009ea0fc	ldr x21,[x19, #0x2e8]
009ea100	sub x9,x8,#0x1
009ea104	ldrb w23,[x22], #0x1
009ea108	subs x8,x9,x23
009ea10c	stp x22,x9,[x20]
009ea110	b.cc 0x009ea120
009ea114	add x9,x22,x23
009ea118	stp x9,x8,[x20]
009ea11c	b.eq 0x009ea3f4
009ea120	bl 0x00c342a0
009ea124	adrp x0,0x2bd000
009ea128	adrp x2,0x2d9000
009ea12c	add x0,x0,#0x74c
009ea130	add x2,x2,#0x94d
009ea134	mov w1,#0xbd3
009ea138	bl 0x00c342b0
009ea13c	mov w1,#0x32
009ea140	mov w2,#0x9f
009ea144	b 0x009ea3b4
009ea148	ldr x8,[x20, #0x8]
009ea14c	subs x8,x8,#0x2
009ea150	b.cc 0x009ea17c
009ea154	ldr x9,[x20]
009ea158	ldrb w10,[x9]
009ea15c	ldrb w22,[x9, #0x1]
009ea160	bfm x22,x10,#0x38,#0x7
009ea164	subs x8,x8,x22
009ea168	b.cc 0x009ea17c
009ea16c	add x23,x9,#0x2
009ea170	add x9,x23,x22
009ea174	stp x9,x8,[x20]
009ea178	b.eq 0x009e9e04
009ea17c	bl 0x00c342a0
009ea180	adrp x0,0x2bd000
009ea184	adrp x2,0x2a2000
009ea188	add x0,x0,#0x74c
009ea18c	add x2,x2,#0xff
009ea190	mov w1,#0xb3f
009ea194	b 0x009e9f74
009ea198	bl 0x00c342a0
009ea19c	adrp x0,0x2bd000
009ea1a0	adrp x2,0x2a2000
009ea1a4	add x0,x0,#0x74c
009ea1a8	add x2,x2,#0xff
009ea1ac	mov w1,#0xb47
009ea1b0	bl 0x00c342b0
009ea1b4	mov w8,#0x103
009ea1b8	movk w8,#0xc, LSL #16
009ea1bc	sub w2,w8,#0x3
009ea1c0	mov w1,#0x50
009ea1c4	b 0x009e9f80
009ea1c8	bl 0x00c342a0
009ea1cc	adrp x22,0x2bd000
009ea1d0	adrp x2,0x2a2000
009ea1d4	add x22,x22,#0x74c
009ea1d8	add x2,x2,#0xff
009ea1dc	mov w1,#0xb5e
009ea1e0	b 0x009ea488
009ea1e4	bl 0x00c342a0
009ea1e8	adrp x21,0x2bd000
009ea1ec	add x21,x21,#0x74c
009ea1f0	adrp x2,0x2a2000
009ea1f4	add x2,x2,#0xff
009ea1f8	mov w1,#0xb4d
009ea1fc	mov x0,x21
009ea200	bl 0x00c342b0
009ea204	mov w8,#0x103
009ea208	movk w8,#0xc, LSL #16
009ea20c	sub w2,w8,#0x3
009ea210	mov w1,#0x50
009ea214	mov x0,x19
009ea218	mov x3,xzr
009ea21c	bl 0x00c34410
009ea220	mov w2,#0xb85
009ea224	mov x0,x20
009ea228	mov x1,x21
009ea22c	bl 0x00c32310
009ea230	mov x0,xzr
009ea234	bl 0x00c34620
009ea238	b 0x009e9f8c
009ea23c	tbnz w24,#0x5,0x009ea2c0
009ea240	tbnz w24,#0x4,0x009ea3d0
009ea244	tbnz w24,#0x9,0x009ea4c0
009ea248	bl 0x00c342a0
009ea24c	adrp x0,0x2bd000
009ea250	adrp x2,0x2db000
009ea254	add x0,x0,#0x74c
009ea258	add x2,x2,#0xce4
009ea25c	mov w1,#0xd07
009ea260	bl 0x00c342b0
009ea264	mov w1,#0x50
009ea268	mov w2,#0xf9
009ea26c	b 0x009e9f80
009ea270	bl 0x00c342a0
009ea274	adrp x0,0x2bd000
009ea278	adrp x2,0x2d9000
009ea27c	add x0,x0,#0x74c
009ea280	add x2,x2,#0x94d
009ea284	mov w1,#0xbc5
009ea288	bl 0x00c342b0
009ea28c	mov w1,#0x28
009ea290	mov w2,#0x137
009ea294	b 0x009ea3b4
009ea298	bl 0x00c342a0
009ea29c	adrp x0,0x2bd000
009ea2a0	adrp x2,0x2db000
009ea2a4	add x0,x0,#0x74c
009ea2a8	add x2,x2,#0xd04
009ea2ac	mov w1,#0xb11
009ea2b0	bl 0x00c342b0
009ea2b4	mov w1,#0x73
009ea2b8	mov w2,#0xdf
009ea2bc	b 0x009e9f80
009ea2c0	ldr x8,[x20, #0x8]
009ea2c4	subs x8,x8,#0x2
009ea2c8	b.cc 0x009ea2ec
009ea2cc	ldr x9,[x20]
009ea2d0	ldrb w10,[x9]
009ea2d4	ldrb w1,[x9, #0x1]
009ea2d8	add x0,x9,#0x2
009ea2dc	stp x0,x8,[x20]
009ea2e0	bfm w1,w10,#0x18,#0x7
009ea2e4	subs x9,x8,x1
009ea2e8	b.cs 0x009ea5ac
009ea2ec	bl 0x00c342a0
009ea2f0	adrp x0,0x2bd000
009ea2f4	adrp x2,0x2c5000
009ea2f8	add x0,x0,#0x74c
009ea2fc	add x2,x2,#0x787
009ea300	mov w1,#0xbfd
009ea304	bl 0x00c342b0
009ea308	mov w1,#0x32
009ea30c	mov w2,#0x15b
009ea310	b 0x009e9f80
009ea314	bl 0x00c342a0
009ea318	adrp x22,0x2bd000
009ea31c	adrp x2,0x2a2000
009ea320	add x22,x22,#0x74c
009ea324	add x2,x2,#0xff
009ea328	mov w1,#0xb6e
009ea32c	b 0x009ea488
009ea330	bl 0x00c342a0
009ea334	adrp x0,0x2bd000
009ea338	adrp x2,0x2b7000
009ea33c	add x0,x0,#0x74c
009ea340	add x2,x2,#0x87e
009ea344	mov w1,#0xb98
009ea348	bl 0x00c342b0
009ea34c	mov w1,#0x50
009ea350	b 0x009ea3b0
009ea354	str xzr,[x19, #0x378]
009ea358	bl 0x00c342a0
009ea35c	adrp x0,0x2bd000
009ea360	adrp x2,0x2db000
009ea364	add x0,x0,#0x74c
009ea368	add x2,x2,#0xd04
009ea36c	mov w1,#0xb1b
009ea370	b 0x009ea1b0
009ea374	bl 0x00c342a0
009ea378	adrp x0,0x2bd000
009ea37c	adrp x2,0x2b7000
009ea380	add x0,x0,#0x74c
009ea384	add x2,x2,#0x87e
009ea388	mov w1,#0xba7
009ea38c	b 0x009ea74c
009ea390	bl 0x00c342a0
009ea394	adrp x0,0x2bd000
009ea398	adrp x2,0x2b7000
009ea39c	add x0,x0,#0x74c
009ea3a0	add x2,x2,#0x87e
009ea3a4	mov w1,#0xb9d
009ea3a8	bl 0x00c342b0
009ea3ac	mov w1,#0x32
009ea3b0	mov w2,#0xab
009ea3b4	mov x0,x19
009ea3b8	mov x3,xzr
009ea3bc	bl 0x00c34410
009ea3c0	mov x20,xzr
009ea3c4	mov x0,x20
009ea3c8	bl 0x00c32450
009ea3cc	b 0x009e9f8c
009ea3d0	mov w8,#0x20
009ea3d4	str x8,[sp]
009ea3d8	ldr x8,[x19, #0x2e0]
009ea3dc	ldr w8,[x8, #0x20]
009ea3e0	tbnz w8,#0x7,0x009ea604
009ea3e4	mov x1,xzr
009ea3e8	tbz w8,#0x5,0x009ea61c
009ea3ec	ldr x8,[x19, #0x898]
009ea3f0	b 0x009ea618
009ea3f4	cbz x21,0x009ea768
009ea3f8	bl 0x00c36450
009ea3fc	mov x20,x0
009ea400	cbz x0,0x009ea734
009ea404	mov x0,x20
009ea408	mov x1,x21
009ea40c	bl 0x00c32440
009ea410	cmp w0,#0x0
009ea414	b.le 0x009ea734
009ea418	mov x0,x20
009ea41c	mov x1,x22
009ea420	mov x2,x23
009ea424	bl 0x00c36460
009ea428	cmp w0,#0x0
009ea42c	b.le 0x009ea894
009ea430	mov w3,#0x1
009ea434	mov x0,x19
009ea438	mov x1,x21
009ea43c	mov x2,x20
009ea440	bl 0x00c34940
009ea444	cbz w0,0x009ea3c4
009ea448	ldr x0,[x19, #0x2e8]
009ea44c	bl 0x00c32450
009ea450	mov x0,x20
009ea454	str xzr,[x19, #0x2e8]
009ea458	bl 0x00c32450
009ea45c	mov w0,#0x2
009ea460	b 0x009e9fb0
009ea464	orr w1,wzr,#0x30
009ea468	mov x0,x20
009ea46c	bl 0x00c34750
009ea470	bl 0x00c342a0
009ea474	adrp x22,0x2bd000
009ea478	adrp x2,0x2a2000
009ea47c	add x22,x22,#0x74c
009ea480	add x2,x2,#0xff
009ea484	mov w1,#0xb78
009ea488	mov x0,x22
009ea48c	bl 0x00c342b0
009ea490	mov w1,#0x33
009ea494	mov w2,#0x93
009ea498	mov x0,x19
009ea49c	mov x3,xzr
009ea4a0	bl 0x00c34410
009ea4a4	mov w2,#0xb85
009ea4a8	mov x0,x20
009ea4ac	mov x1,x22
009ea4b0	bl 0x00c32310
009ea4b4	mov x0,x21
009ea4b8	bl 0x00c34620
009ea4bc	b 0x009e9f8c
009ea4c0	mov w8,#0x20
009ea4c4	mov x0,x19
009ea4c8	stur x8,[x29, #-0x48]
009ea4cc	bl 0x00c370a0
009ea4d0	cbz w0,0x009ea7ec
009ea4d4	mov w22,w0
009ea4d8	sub x1,x29,#0x70
009ea4dc	mov x0,x19
009ea4e0	bl 0x00c370b0
009ea4e4	cmp w0,#0x0
009ea4e8	b.le 0x009ea858
009ea4ec	ldr x8,[x19, #0x898]
009ea4f0	ldr x1,[x8, #0x118]
009ea4f4	cbnz x1,0x009ea500
009ea4f8	ldr x1,[x8, #0xf0]
009ea4fc	cbz x1,0x009ea998
009ea500	ldr x8,[x19, #0x9a8]
009ea504	ldr x0,[x8]
009ea508	ldr x2,[x8, #0x440]
009ea50c	bl 0x00c34640
009ea510	mov x21,x0
009ea514	cbz x0,0x009ea8c4
009ea518	mov x0,x21
009ea51c	bl 0x00c37330
009ea520	cmp w0,#0x0
009ea524	b.le 0x009ea93c
009ea528	mov w1,#0xffffffff
009ea52c	mov w2,#0x400
009ea530	mov w3,#0x8
009ea534	mov w4,#0x20
009ea538	sub x5,x29,#0x70
009ea53c	mov x0,x21
009ea540	bl 0x00c370f0
009ea544	cmp w0,#0x0
009ea548	b.le 0x009ea9c0
009ea54c	mov w1,#0xffffffff
009ea550	mov w2,#0x400
009ea554	orr w3,wzr,#0xc
009ea558	mov x0,x21
009ea55c	mov w4,w22
009ea560	mov x5,xzr
009ea564	bl 0x00c370f0
009ea568	cmp w0,#0x0
009ea56c	b.le 0x009ea9f8
009ea570	ldp x3,x4,[x20]
009ea574	mov x1,sp
009ea578	sub x2,x29,#0x48
009ea57c	mov x0,x21
009ea580	bl 0x00c37320
009ea584	cmp w0,#0x0
009ea588	b.le 0x009eaaac
009ea58c	mov x1,sp
009ea590	mov w2,#0x20
009ea594	mov x0,x19
009ea598	mov w3,wzr
009ea59c	bl 0x00c349b0
009ea5a0	cmp w0,#0x0
009ea5a4	cset w20,ne
009ea5a8	b 0x009eaa2c
009ea5ac	add x8,x0,x1
009ea5b0	mov x2,xzr
009ea5b4	stp x8,x9,[x20]
009ea5b8	bl 0x00c36970
009ea5bc	str x0,[x19, #0xc18]
009ea5c0	cbz x0,0x009ea82c
009ea5c4	ldr x1,[x19, #0xbf8]
009ea5c8	bl 0x00c369c0
009ea5cc	tbz w0,#0x1f,0x009ea5dc
009ea5d0	ldr x0,[x19, #0xc18]
009ea5d4	bl 0x00c369b0
009ea5d8	cbz w0,0x009ea8f4
009ea5dc	bl 0x00c342a0
009ea5e0	adrp x0,0x2bd000
009ea5e4	adrp x2,0x2c5000
009ea5e8	add x0,x0,#0x74c
009ea5ec	add x2,x2,#0x787
009ea5f0	mov w1,#0xc05
009ea5f4	bl 0x00c342b0
009ea5f8	mov w1,#0x2f
009ea5fc	mov w2,#0x173
009ea600	b 0x009e9f80
009ea604	ldr x8,[x19, #0x898]
009ea608	ldr x1,[x8, #0x118]
009ea60c	cbnz x1,0x009ea61c
009ea610	ldr x1,[x8, #0xf0]
009ea614	cbnz x1,0x009ea61c
009ea618	ldr x1,[x8, #0xc8]
009ea61c	ldr x8,[x19, #0x9a8]
009ea620	ldr x0,[x8]
009ea624	ldr x2,[x8, #0x440]
009ea628	bl 0x00c34640
009ea62c	cbz x0,0x009ea6d0
009ea630	mov x21,x0
009ea634	bl 0x00c37330
009ea638	cmp w0,#0x0
009ea63c	b.le 0x009ea790
009ea640	ldr x8,[x19, #0x918]
009ea644	ldr x0,[x8, #0x2b8]
009ea648	bl 0x00c32cb0
009ea64c	cbz x0,0x009ea668
009ea650	mov x1,x0
009ea654	mov x0,x21
009ea658	bl 0x00c346b0
009ea65c	cmp w0,#0x0
009ea660	b.gt 0x009ea668
009ea664	bl 0x00c323e0
009ea668	ldp x8,x2,[x20]
009ea66c	adrp x3,0xc58000
009ea670	add x3,x3,#0x888
009ea674	sub x1,x29,#0x48
009ea678	mov x0,xzr
009ea67c	stur x8,[x29, #-0x48]
009ea680	bl 0x00c36150
009ea684	mov x22,x0
009ea688	cbz x0,0x009ea700
009ea68c	ldr x0,[x22]
009ea690	cbz x0,0x009ea700
009ea694	bl 0x00c372d0
009ea698	cmp w0,#0x10
009ea69c	b.ne 0x009ea700
009ea6a0	ldur x9,[x29, #-0x48]
009ea6a4	ldp x8,x11,[x20]
009ea6a8	sub x10,x9,x8
009ea6ac	subs x9,x11,x10
009ea6b0	b.cs 0x009ea968
009ea6b4	bl 0x00c342a0
009ea6b8	adrp x0,0x2bd000
009ea6bc	adrp x2,0x2a9000
009ea6c0	add x0,x0,#0x74c
009ea6c4	add x2,x2,#0xf34
009ea6c8	mov w1,#0xc5b
009ea6cc	b 0x009ea98c
009ea6d0	bl 0x00c342a0
009ea6d4	adrp x0,0x2bd000
009ea6d8	adrp x2,0x2a9000
009ea6dc	add x0,x0,#0x74c
009ea6e0	add x2,x2,#0xf34
009ea6e4	mov w1,#0xc3c
009ea6e8	bl 0x00c342b0
009ea6ec	mov w8,#0x103
009ea6f0	movk w8,#0xc, LSL #16
009ea6f4	sub w2,w8,#0x3
009ea6f8	mov w1,#0x50
009ea6fc	b 0x009ea814
009ea700	bl 0x00c342a0
009ea704	adrp x0,0x2bd000
009ea708	adrp x2,0x2a9000
009ea70c	add x0,x0,#0x74c
009ea710	add x2,x2,#0xf34
009ea714	mov w1,#0xc56
009ea718	bl 0x00c342b0
009ea71c	mov w1,#0x32
009ea720	mov w2,#0x93
009ea724	mov x0,x19
009ea728	mov x3,xzr
009ea72c	bl 0x00c34410
009ea730	b 0x009ea7c8
009ea734	bl 0x00c342a0
009ea738	adrp x0,0x2bd000
009ea73c	adrp x2,0x2d9000
009ea740	add x0,x0,#0x74c
009ea744	add x2,x2,#0x94d
009ea748	mov w1,#0xbdd
009ea74c	bl 0x00c342b0
009ea750	mov w1,#0x50
009ea754	mov w2,#0x128
009ea758	mov x0,x19
009ea75c	mov x3,xzr
009ea760	bl 0x00c34410
009ea764	b 0x009ea3c4
009ea768	bl 0x00c342a0
009ea76c	adrp x0,0x2bd000
009ea770	adrp x2,0x2d9000
009ea774	add x0,x0,#0x74c
009ea778	add x2,x2,#0x94d
009ea77c	mov w1,#0xbd7
009ea780	bl 0x00c342b0
009ea784	mov w1,#0x50
009ea788	mov w2,#0x137
009ea78c	b 0x009ea3b4
009ea790	bl 0x00c342a0
009ea794	adrp x0,0x2bd000
009ea798	adrp x2,0x2a9000
009ea79c	add x0,x0,#0x74c
009ea7a0	add x2,x2,#0xf34
009ea7a4	mov w1,#0xc40
009ea7a8	bl 0x00c342b0
009ea7ac	mov w2,#0x103
009ea7b0	mov w1,#0x50
009ea7b4	movk w2,#0xc, LSL #16
009ea7b8	mov x0,x19
009ea7bc	mov x3,xzr
009ea7c0	bl 0x00c34410
009ea7c4	mov x22,xzr
009ea7c8	mov w20,wzr
009ea7cc	mov x0,x21
009ea7d0	bl 0x00c34620
009ea7d4	adrp x1,0xc58000
009ea7d8	add x1,x1,#0x888
009ea7dc	mov x0,x22
009ea7e0	bl 0x00c36160
009ea7e4	cbnz w20,0x009ea08c
009ea7e8	b 0x009e9f8c
009ea7ec	bl 0x00c342a0
009ea7f0	adrp x0,0x2bd000
009ea7f4	adrp x2,0x2c5000
009ea7f8	add x0,x0,#0x74c
009ea7fc	add x2,x2,#0x79b
009ea800	mov w1,#0xc90
009ea804	bl 0x00c342b0
009ea808	mov w2,#0x103
009ea80c	mov w1,#0x50
009ea810	movk w2,#0xc, LSL #16
009ea814	mov x0,x19
009ea818	mov x3,xzr
009ea81c	bl 0x00c34410
009ea820	mov w20,wzr
009ea824	cbnz w20,0x009ea08c
009ea828	b 0x009e9f8c
009ea82c	bl 0x00c342a0
009ea830	adrp x0,0x2bd000
009ea834	adrp x2,0x2c5000
009ea838	add x0,x0,#0x74c
009ea83c	add x2,x2,#0x787
009ea840	mov w1,#0xc01
009ea844	bl 0x00c342b0
009ea848	mov w2,#0x3
009ea84c	mov w1,#0x50
009ea850	movk w2,#0x8, LSL #16
009ea854	b 0x009e9f80
009ea858	bl 0x00c342a0
009ea85c	adrp x0,0x2bd000
009ea860	adrp x2,0x2c5000
009ea864	add x0,x0,#0x74c
009ea868	add x2,x2,#0x79b
009ea86c	mov w1,#0xc95
009ea870	bl 0x00c342b0
009ea874	mov w2,#0x103
009ea878	mov w1,#0x50
009ea87c	movk w2,#0xc, LSL #16
009ea880	mov x0,x19
009ea884	mov x3,xzr
009ea888	bl 0x00c34410
009ea88c	mov x21,xzr
009ea890	b 0x009eaa28
009ea894	bl 0x00c342a0
009ea898	adrp x0,0x2bd000
009ea89c	adrp x2,0x2d9000
009ea8a0	add x0,x0,#0x74c
009ea8a4	add x2,x2,#0x94d
009ea8a8	mov w1,#0xbe2
009ea8ac	bl 0x00c342b0
009ea8b0	mov w8,#0x3
009ea8b4	movk w8,#0x8, LSL #16
009ea8b8	add w2,w8,#0xd
009ea8bc	mov w1,#0x50
009ea8c0	b 0x009ea758
009ea8c4	bl 0x00c342a0
009ea8c8	adrp x0,0x2bd000
009ea8cc	adrp x2,0x2c5000
009ea8d0	add x0,x0,#0x74c
009ea8d4	add x2,x2,#0x79b
009ea8d8	mov w1,#0xca4
009ea8dc	bl 0x00c342b0
009ea8e0	mov w8,#0x103
009ea8e4	movk w8,#0xc, LSL #16
009ea8e8	sub w2,w8,#0x3
009ea8ec	mov w1,#0x50
009ea8f0	b 0x009eaa1c
009ea8f4	ldr x8,[x19, #0x918]
009ea8f8	adrp x20,0x2bd000
009ea8fc	add x20,x20,#0x74c
009ea900	mov w2,#0xc08
009ea904	ldr x0,[x8, #0x370]
009ea908	mov x1,x20
009ea90c	bl 0x00c32310
009ea910	ldr x0,[x19, #0xbf0]
009ea914	mov w2,#0xc09
009ea918	mov x1,x20
009ea91c	bl 0x00c34600
009ea920	ldr x8,[x19, #0x918]
009ea924	str x0,[x8, #0x370]
009ea928	cbz x0,0x009ea9dc
009ea92c	mov x0,x19
009ea930	bl 0x00c36a90
009ea934	cbnz w0,0x009ea08c
009ea938	b 0x009e9f8c
009ea93c	bl 0x00c342a0
009ea940	adrp x0,0x2bd000
009ea944	adrp x2,0x2c5000
009ea948	add x0,x0,#0x74c
009ea94c	add x2,x2,#0x79b
009ea950	mov w1,#0xca8
009ea954	bl 0x00c342b0
009ea958	mov w2,#0x103
009ea95c	mov w1,#0x50
009ea960	movk w2,#0xc, LSL #16
009ea964	b 0x009eaa1c
009ea968	add x8,x8,x10
009ea96c	stp x8,x9,[x20]
009ea970	b.eq 0x009eaa3c
009ea974	bl 0x00c342a0
009ea978	adrp x0,0x2bd000
009ea97c	adrp x2,0x2a9000
009ea980	add x0,x0,#0x74c
009ea984	add x2,x2,#0xf34
009ea988	mov w1,#0xc60
009ea98c	bl 0x00c342b0
009ea990	mov w1,#0x50
009ea994	b 0x009ea720
009ea998	bl 0x00c342a0
009ea99c	adrp x0,0x2bd000
009ea9a0	adrp x2,0x2c5000
009ea9a4	add x0,x0,#0x74c
009ea9a8	add x2,x2,#0x79b
009ea9ac	mov w1,#0xc9e
009ea9b0	bl 0x00c342b0
009ea9b4	mov w1,#0x50
009ea9b8	mov w2,#0xec
009ea9bc	b 0x009ea880
009ea9c0	bl 0x00c342a0
009ea9c4	adrp x0,0x2bd000
009ea9c8	adrp x2,0x2c5000
009ea9cc	add x0,x0,#0x74c
009ea9d0	add x2,x2,#0x79b
009ea9d4	mov w1,#0xcaf
009ea9d8	b 0x009eaa10
009ea9dc	bl 0x00c342a0
009ea9e0	adrp x0,0x2bd000
009ea9e4	adrp x2,0x2c5000
009ea9e8	add x0,x0,#0x74c
009ea9ec	add x2,x2,#0x787
009ea9f0	mov w1,#0xc0b
009ea9f4	b 0x009ea1b0
009ea9f8	bl 0x00c342a0
009ea9fc	adrp x0,0x2bd000
009eaa00	adrp x2,0x2c5000
009eaa04	add x0,x0,#0x74c
009eaa08	add x2,x2,#0x79b
009eaa0c	mov w1,#0xcb5
009eaa10	bl 0x00c342b0
009eaa14	mov w1,#0x50
009eaa18	mov w2,#0x112
009eaa1c	mov x0,x19
009eaa20	mov x3,xzr
009eaa24	bl 0x00c34410
009eaa28	mov w20,wzr
009eaa2c	mov x0,x21
009eaa30	bl 0x00c34620
009eaa34	cbnz w20,0x009ea08c
009eaa38	b 0x009e9f8c
009eaa3c	ldr x8,[x22]
009eaa40	sub x1,x29,#0x70
009eaa44	mov x2,sp
009eaa48	mov x0,x21
009eaa4c	ldr x8,[x8, #0x8]
009eaa50	ldrsw x4,[x8]
009eaa54	ldr x3,[x8, #0x8]
009eaa58	bl 0x00c37320
009eaa5c	cmp w0,#0x0
009eaa60	b.le 0x009eaad4
009eaa64	sub x1,x29,#0x70
009eaa68	mov w2,#0x20
009eaa6c	mov x0,x19
009eaa70	mov w3,wzr
009eaa74	bl 0x00c349b0
009eaa78	cbz w0,0x009ea7c8
009eaa7c	mov w1,#0xffffffff
009eaa80	mov w2,#0xffffffff
009eaa84	mov w3,#0x2
009eaa88	mov w4,#0x2
009eaa8c	mov x0,x21
009eaa90	mov x5,xzr
009eaa94	bl 0x00c370f0
009eaa98	cmp w0,#0x1
009eaa9c	mov w20,#0x1
009eaaa0	b.lt 0x009ea7cc
009eaaa4	str w20,[x19, #0x74]
009eaaa8	b 0x009ea7cc
009eaaac	bl 0x00c342a0
009eaab0	adrp x0,0x2bd000
009eaab4	adrp x2,0x2c5000
009eaab8	add x0,x0,#0x74c
009eaabc	add x2,x2,#0x79b
009eaac0	mov w1,#0xcbc
009eaac4	bl 0x00c342b0
009eaac8	mov w1,#0x32
009eaacc	mov w2,#0x93
009eaad0	b 0x009eaa1c
009eaad4	bl 0x00c342a0
009eaad8	adrp x0,0x2bd000
009eaadc	adrp x2,0x2a9000
009eaae0	add x0,x0,#0x74c
009eaae4	add x2,x2,#0xf34
009eaae8	mov w1,#0xc69
009eaaec	b 0x009ea718

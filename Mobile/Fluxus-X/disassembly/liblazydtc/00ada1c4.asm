; ossl_rsa_check_private_exponent @ 00ada1c4
00ada1c4	stp x26,x25,[sp, #-0x50]!
00ada1c8	stp x24,x23,[sp, #0x10]
00ada1cc	stp x22,x21,[sp, #0x20]
00ada1d0	stp x20,x19,[sp, #0x30]
00ada1d4	stp x29,x30,[sp, #0x40]
00ada1d8	mov x24,x0
00ada1dc	ldr x0,[x0, #0x38]
00ada1e0	add x29,sp,#0x40
00ada1e4	mov x19,x2
00ada1e8	mov w20,w1
00ada1ec	bl 0x00c322f0
00ada1f0	cmp w0,w20, ASR #0x1
00ada1f4	mov w26,wzr
00ada1f8	b.le 0x00ada338
00ada1fc	mov x0,x19
00ada200	bl 0x00c38a90
00ada204	mov x0,x19
00ada208	bl 0x00c38a40
00ada20c	mov x20,x0
00ada210	mov x0,x19
00ada214	bl 0x00c38a40
00ada218	mov x21,x0
00ada21c	mov x0,x19
00ada220	bl 0x00c38a40
00ada224	mov x22,x0
00ada228	mov x0,x19
00ada22c	bl 0x00c38a40
00ada230	mov x23,x0
00ada234	mov x0,x19
00ada238	bl 0x00c38a40
00ada23c	mov x26,x0
00ada240	mov x0,x19
00ada244	bl 0x00c38a40
00ada248	mov x25,x0
00ada24c	cbz x0,0x00ada304
00ada250	mov w1,#0x4
00ada254	mov x0,x20
00ada258	bl 0x00c38dc0
00ada25c	mov w1,#0x4
00ada260	mov x0,x21
00ada264	bl 0x00c38dc0
00ada268	mov w1,#0x4
00ada26c	mov x0,x22
00ada270	bl 0x00c38dc0
00ada274	mov w1,#0x4
00ada278	mov x0,x23
00ada27c	bl 0x00c38dc0
00ada280	mov w1,#0x4
00ada284	mov x0,x26
00ada288	bl 0x00c38dc0
00ada28c	mov w1,#0x4
00ada290	mov x0,x25
00ada294	bl 0x00c38dc0
00ada298	ldp x1,x2,[x24, #0x40]
00ada29c	mov x0,x19
00ada2a0	mov x3,x23
00ada2a4	mov x4,x25
00ada2a8	mov x5,x21
00ada2ac	mov x6,x22
00ada2b0	mov x7,x26
00ada2b4	bl 0x00ada354
00ada2b8	cmp w0,#0x1
00ada2bc	mov w26,wzr
00ada2c0	b.ne 0x00ada308
00ada2c4	ldr x0,[x24, #0x38]
00ada2c8	mov x1,x23
00ada2cc	bl 0x00c38cc0
00ada2d0	mov w26,wzr
00ada2d4	tbz w0,#0x1f,0x00ada308
00ada2d8	ldp x1,x2,[x24, #0x30]
00ada2dc	mov x0,x20
00ada2e0	mov x3,x23
00ada2e4	mov x4,x19
00ada2e8	bl 0x00c38ef0
00ada2ec	cbz w0,0x00ada304
00ada2f0	mov x0,x20
00ada2f4	bl 0x00c38d20
00ada2f8	cmp w0,#0x0
00ada2fc	cset w26,ne
00ada300	b 0x00ada308
00ada304	mov w26,wzr
00ada308	mov x0,x20
00ada30c	bl 0x00c38ca0
00ada310	mov x0,x21
00ada314	bl 0x00c38ca0
00ada318	mov x0,x22
00ada31c	bl 0x00c38ca0
00ada320	mov x0,x23
00ada324	bl 0x00c38ca0
00ada328	mov x0,x25
00ada32c	bl 0x00c38ca0
00ada330	mov x0,x19
00ada334	bl 0x00c38a20
00ada338	ldp x29,x30,[sp, #0x40]
00ada33c	ldp x20,x19,[sp, #0x30]
00ada340	ldp x22,x21,[sp, #0x20]
00ada344	ldp x24,x23,[sp, #0x10]
00ada348	mov w0,w26
00ada34c	ldp x26,x25,[sp], #0x50
00ada350	ret

; evp_keymgmt_util_find_operation_cache @ 00a65a74
00a65a74	str x23,[sp, #-0x40]!
00a65a78	stp x22,x21,[sp, #0x10]
00a65a7c	stp x20,x19,[sp, #0x20]
00a65a80	stp x29,x30,[sp, #0x30]
00a65a84	mov x20,x0
00a65a88	ldr x0,[x0, #0x78]
00a65a8c	add x29,sp,#0x30
00a65a90	mov w19,w2
00a65a94	mov x21,x1
00a65a98	bl 0x00c325e0
00a65a9c	cmp w0,#0x1
00a65aa0	b.lt 0x00a65afc
00a65aa4	mov w22,w0
00a65aa8	mov w23,wzr
00a65aac	ldr x0,[x20, #0x78]
00a65ab0	mov w1,w23
00a65ab4	bl 0x00c32610
00a65ab8	ldr w8,[x0, #0x10]
00a65abc	bics wzr,w19,w8
00a65ac0	b.ne 0x00a65af0
00a65ac4	ldr x8,[x0]
00a65ac8	cmp x8,x21
00a65acc	b.eq 0x00a65b00
00a65ad0	ldr w9,[x21, #0x4]
00a65ad4	ldr w10,[x8, #0x4]
00a65ad8	cmp w9,w10
00a65adc	b.ne 0x00a65af0
00a65ae0	ldr x9,[x21, #0x18]
00a65ae4	ldr x8,[x8, #0x18]
00a65ae8	cmp x9,x8
00a65aec	b.eq 0x00a65b00
00a65af0	add w23,w23,#0x1
00a65af4	cmp w23,w22
00a65af8	b.lt 0x00a65aac
00a65afc	mov x0,xzr
00a65b00	ldp x29,x30,[sp, #0x30]
00a65b04	ldp x20,x19,[sp, #0x20]
00a65b08	ldp x22,x21,[sp, #0x10]
00a65b0c	ldr x23,[sp], #0x40
00a65b10	ret

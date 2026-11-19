; evp_pkey_ctx_state @ 00a74e5c
00a74e5c	mov x8,x0
00a74e60	ldr w0,[x0]
00a74e64	cmp w0,#0x7f
00a74e68	b.le 0x00a74e90
00a74e6c	cmp w0,#0x3ff
00a74e70	b.le 0x00a74ecc
00a74e74	cmp w0,#0xfff
00a74e78	b.gt 0x00a74f08
00a74e7c	cmp w0,#0x400
00a74e80	b.eq 0x00a74ee4
00a74e84	cmp w0,#0x800
00a74e88	b.eq 0x00a74f18
00a74e8c	b 0x00a74f30
00a74e90	cmp w0,#0x20
00a74e94	b.hi 0x00a74f28
00a74e98	adrp x10,0x766000
00a74e9c	mov w9,w0
00a74ea0	add x10,x10,#0x5e8
00a74ea4	ldrsw x9,[x10, x9, LSL #0x2]
00a74ea8	add x9,x9,x10
00a74eac	br x9
00a74eb0	ldr x9,[x8, #0x28]
00a74eb4	cbnz x9,0x00a74f20
00a74eb8	cmp w0,#0x2, LSL #12
00a74ebc	b.eq 0x00a74f18
00a74ec0	cmp w0,#0x1, LSL #12
00a74ec4	b.eq 0x00a74f18
00a74ec8	b 0x00a74f30
00a74ecc	cmp w0,#0x80
00a74ed0	b.eq 0x00a74f18
00a74ed4	cmp w0,#0x100
00a74ed8	b.eq 0x00a74f18
00a74edc	cmp w0,#0x200
00a74ee0	b.ne 0x00a74f30
00a74ee4	ldr x9,[x8, #0x30]
00a74ee8	cbnz x9,0x00a74f20
00a74eec	cmp w0,#0xfff
00a74ef0	b.gt 0x00a74f08
00a74ef4	cmp w0,#0x2
00a74ef8	b.eq 0x00a74eb0
00a74efc	cmp w0,#0x4
00a74f00	b.eq 0x00a74eb0
00a74f04	b 0x00a74f30
00a74f08	cmp w0,#0x1, LSL #12
00a74f0c	b.eq 0x00a74f18
00a74f10	cmp w0,#0x2, LSL #12
00a74f14	b.ne 0x00a74f30
00a74f18	ldr x8,[x8, #0x30]
00a74f1c	cbz x8,0x00a74f30
00a74f20	mov w0,#0x2
00a74f24	ret
00a74f28	cmp w0,#0x40
00a74f2c	b.eq 0x00a74f18
00a74f30	mov w0,#0x1
00a74f34	ret

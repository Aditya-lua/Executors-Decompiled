; psa_sign_hash_builtin @ 00b89770
00b89770	ldrh w9,[x0]
00b89774	ldr x8,[sp]
00b89778	mov w10,#0x7001
00b8977c	cmp w9,w10
00b89780	b.ne 0x00b897c0
00b89784	mov w10,#0x200
00b89788	and w9,w3,#0xffffff00
00b8978c	movk w10,#0x600, LSL #16
00b89790	cmp w9,w10
00b89794	b.eq 0x00b897b8
00b89798	mov w10,#0x1300
00b8979c	movk w10,#0x600, LSL #16
00b897a0	cmp w9,w10
00b897a4	b.eq 0x00b897b8
00b897a8	mov w10,#0x300
00b897ac	movk w10,#0x600, LSL #16
00b897b0	cmp w9,w10
00b897b4	b.ne 0x00b897f4
00b897b8	str x8,[sp]
00b897bc	b 0x00c43160
00b897c0	mov w10,#0xcf00
00b897c4	and w9,w9,w10
00b897c8	mov w10,#0x4100
00b897cc	cmp w9,w10
00b897d0	b.ne 0x00b897ec
00b897d4	lsr w9,w3,#0x9
00b897d8	orr w10,wzr,#0x30003
00b897dc	cmp w9,w10
00b897e0	b.ne 0x00b897f4
00b897e4	str x8,[sp]
00b897e8	b 0x00c42f20
00b897ec	mov w0,#0xffffff7a
00b897f0	ret
00b897f4	mov w0,#0xffffff79
00b897f8	ret

; ossl_rand_pool_keep_random_devices_open @ 00b5bb20
00b5bb20	sub sp,sp,#0xb0
00b5bb24	stp x20,x19,[sp, #0x90]
00b5bb28	mov w19,w0
00b5bb2c	stp x22,x21,[sp, #0x80]
00b5bb30	stp x29,x30,[sp, #0xa0]
00b5bb34	add x29,sp,#0xa0
00b5bb38	cbnz w0,0x00b5bbcc
00b5bb3c	adrp x21,0xd23000
00b5bb40	mov x20,xzr
00b5bb44	add x21,x21,#0x828
00b5bb48	mov w22,#0xffffffff
00b5bb4c	ldr w0,[x21, x20#0x0]
00b5bb50	cmn w0,#0x1
00b5bb54	b.eq 0x00b5bbbc
00b5bb58	mov x1,sp
00b5bb5c	bl 0x00c31d70
00b5bb60	cmn w0,#0x1
00b5bb64	b.eq 0x00b5bbbc
00b5bb68	add x8,x21,x20
00b5bb6c	ldr x9,[x8, #0x8]
00b5bb70	ldr x10,[sp]
00b5bb74	cmp x9,x10
00b5bb78	b.ne 0x00b5bbbc
00b5bb7c	ldr x8,[x8, #0x10]
00b5bb80	ldr x9,[sp, #0x8]
00b5bb84	cmp x8,x9
00b5bb88	b.ne 0x00b5bbbc
00b5bb8c	add x8,x21,x20
00b5bb90	ldr w9,[x8, #0x18]
00b5bb94	ldr w10,[sp, #0x10]
00b5bb98	eor w9,w10,w9
00b5bb9c	cmp w9,#0x200
00b5bba0	b.cs 0x00b5bbbc
00b5bba4	ldr x8,[x8, #0x20]
00b5bba8	ldr x9,[sp, #0x20]
00b5bbac	cmp x8,x9
00b5bbb0	b.ne 0x00b5bbbc
00b5bbb4	ldr w0,[x21, x20#0x0]
00b5bbb8	bl 0x00c31bf0
00b5bbbc	str w22,[x21, x20#0x0]
00b5bbc0	add x20,x20,#0x28
00b5bbc4	cmp x20,#0xa0
00b5bbc8	b.ne 0x00b5bb4c
00b5bbcc	adrp x8,0xcca000
00b5bbd0	str w19,[x8, #0x448]
00b5bbd4	ldp x29,x30,[sp, #0xa0]
00b5bbd8	ldp x20,x19,[sp, #0x90]
00b5bbdc	ldp x22,x21,[sp, #0x80]
00b5bbe0	add sp,sp,#0xb0
00b5bbe4	ret

; dtls_buffer_listen_record @ 009cfbc0
009cfbc0	stp x22,x21,[sp, #-0x30]!
009cfbc4	mov w8,#0x12a8
009cfbc8	stp x20,x19,[sp, #0x10]
009cfbcc	mov x20,x2
009cfbd0	mov x21,x1
009cfbd4	mov x22,x0
009cfbd8	add x0,x0,x8
009cfbdc	mov w2,#0x50
009cfbe0	mov w1,wzr
009cfbe4	stp x29,x30,[sp, #0x20]
009cfbe8	add x29,sp,#0x20
009cfbec	mov x19,x3
009cfbf0	bl 0x00c301c0
009cfbf4	mov w8,#0x16
009cfbf8	str x21,[x22, #0x12b0]
009cfbfc	str w8,[x22, #0x12ac]
009cfc00	add x11,x21,#0xd
009cfc04	ldr x9,[x20]
009cfc08	ldr x10,[x22, #0xc78]
009cfc0c	str x11,[x22, #0x1cb0]
009cfc10	ldr x11,[x22, #0x1d10]
009cfc14	mov w8,#0x12f0
009cfc18	add x2,x22,x8
009cfc1c	add x8,x10,#0xd
009cfc20	add x1,x11,#0x38
009cfc24	mov x0,x22
009cfc28	str x19,[x22, #0x12c0]
009cfc2c	str x10,[x22, #0x1ca8]
009cfc30	str x8,[x22, #0x12c8]
009cfc34	str x9,[x22, #0x12f0]
009cfc38	bl 0x00c36b10
009cfc3c	ldp x29,x30,[sp, #0x20]
009cfc40	ldp x20,x19,[sp, #0x10]
009cfc44	cmp w0,#0x0
009cfc48	cset w0,gt
009cfc4c	ldp x22,x21,[sp], #0x30
009cfc50	ret

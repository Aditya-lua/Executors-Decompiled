; tls1_alert_code @ 009c0c1c
009c0c1c	cmp w0,#0x78
009c0c20	b.hi 0x009c0c48
009c0c24	adrp x9,0x74c000
009c0c28	mov w8,w0
009c0c2c	add x9,x9,#0xa20
009c0c30	ldrsw x8,[x9, x8, LSL #0x2]
009c0c34	add x8,x8,x9
009c0c38	br x8
009c0c3c	ret
009c0c40	mov w0,#0x28
009c0c44	ret
009c0c48	mov w0,#0xffffffff
009c0c4c	ret

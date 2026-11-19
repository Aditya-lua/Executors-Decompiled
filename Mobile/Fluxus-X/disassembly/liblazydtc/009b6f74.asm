; SSL_get_version @ 009b6f74
009b6f74	ldr w8,[x0]
009b6f78	mov w9,#0xfefc
009b6f7c	cmp w8,w9
009b6f80	b.gt 0x009b6fb8
009b6f84	sub w9,w8,#0x300
009b6f88	cmp w9,#0x4
009b6f8c	b.hi 0x009b6fdc
009b6f90	adrp x8,0x74c000
009b6f94	add x8,x8,#0x47c
009b6f98	ldrsw x9,[x8, x9, LSL #0x2]
009b6f9c	adrp x0,0x2b5000
009b6fa0	add x0,x0,#0x629
009b6fa4	add x8,x9,x8
009b6fa8	br x8
009b6fac	adrp x0,0x2cb000
009b6fb0	add x0,x0,#0x285
009b6fb4	ret
009b6fb8	mov w9,#0xfefd
009b6fbc	cmp w8,w9
009b6fc0	b.eq 0x009b7014
009b6fc4	mov w9,#0xfeff
009b6fc8	cmp w8,w9
009b6fcc	b.ne 0x009b7020
009b6fd0	adrp x0,0x2d7000
009b6fd4	add x0,x0,#0xa16
009b6fd8	ret
009b6fdc	cmp w8,#0x100
009b6fe0	b.ne 0x009b7020
009b6fe4	adrp x0,0x2c1000
009b6fe8	add x0,x0,#0x6ac
009b6fec	ret
009b6ff0	adrp x0,0x2d5000
009b6ff4	add x0,x0,#0x70d
009b6ff8	ret
009b6ffc	adrp x0,0x29d000
009b7000	add x0,x0,#0xa07
009b7004	ret
009b7008	adrp x0,0x2d9000
009b700c	add x0,x0,#0x2ff
009b7010	ret
009b7014	adrp x0,0x2c7000
009b7018	add x0,x0,#0x602
009b701c	ret
009b7020	adrp x0,0x2ab000
009b7024	add x0,x0,#0x4b6
009b7028	ret

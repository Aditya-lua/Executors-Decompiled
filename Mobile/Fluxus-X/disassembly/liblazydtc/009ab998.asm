; ssl3_alert_code @ 009ab998
009ab998	cmp w0,#0x78
009ab99c	b.hi 0x009ab9c0
009ab9a0	adrp x9,0x74b000
009ab9a4	mov w8,w0
009ab9a8	add x9,x9,#0x160
009ab9ac	ldrsw x8,[x9, x8, LSL #0x2]
009ab9b0	add x8,x8,x9
009ab9b4	br x8
009ab9b8	mov w0,#0x28
009ab9bc	ret
009ab9c0	mov w0,#0xffffffff
009ab9c4	ret
009ab9c8	mov w0,#0x14
009ab9cc	ret
009ab9d0	mov w0,#0x2a
009ab9d4	ret

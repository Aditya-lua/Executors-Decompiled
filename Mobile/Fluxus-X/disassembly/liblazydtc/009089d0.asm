; FUN_009089d0 @ 009089d0
009089d0	ldr x8,[x0, #0x20]
009089d4	add x9,x8,w1, SXTW  #0x4
009089d8	ldr x9,[x9, #0x258]
009089dc	cmp x9,#0x0
009089e0	b.le 0x009089ec
009089e4	mov w0,#0x1
009089e8	ret
009089ec	sxtw x9,w1
009089f0	add x8,x8,x9, LSL #0x4
009089f4	ldr w8,[x8, #0x260]
009089f8	cmp w8,#0x0
009089fc	cset w0,gt
00908a00	ret

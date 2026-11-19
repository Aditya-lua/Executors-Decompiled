; ssl_md @ 009ae8b0
009ae8b0	and w9,w1,#0xff
009ae8b4	cmp w9,#0xd
009ae8b8	mov x8,xzr
009ae8bc	b.hi 0x009ae8c8
009ae8c0	add x8,x0,w9, UXTW  #0x3
009ae8c4	ldr x8,[x8, #0x540]
009ae8c8	mov x0,x8
009ae8cc	ret

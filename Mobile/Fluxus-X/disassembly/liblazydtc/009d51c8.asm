; tls_parse_stoc_etm @ 009d51c8
009d51c8	ldrb w8,[x0, #0x9ea]
009d51cc	tbnz w8,#0x3,0x009d51e0
009d51d0	ldr x8,[x0, #0x2e0]
009d51d4	ldr w9,[x8, #0x28]
009d51d8	cmp w9,#0x40
009d51dc	b.ne 0x009d51e8
009d51e0	mov w0,#0x1
009d51e4	ret
009d51e8	ldr w8,[x8, #0x24]
009d51ec	cmp w8,#0x40, LSL #12
009d51f0	b.lt 0x009d520c
009d51f4	b.eq 0x009d51e0
009d51f8	cmp w8,#0x400, LSL #12
009d51fc	b.eq 0x009d51e0
009d5200	cmp w8,#0x800, LSL #12
009d5204	b.eq 0x009d51e0
009d5208	b 0x009d521c
009d520c	cmp w8,#0x4
009d5210	b.eq 0x009d51e0
009d5214	cmp w8,#0x400
009d5218	b.eq 0x009d51e0
009d521c	mov w8,#0x1
009d5220	str w8,[x0, #0xb2c]
009d5224	mov w0,#0x1
009d5228	ret

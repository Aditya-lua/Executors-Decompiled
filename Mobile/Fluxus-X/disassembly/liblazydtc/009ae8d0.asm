; ssl_handshake_md @ 009ae8d0
009ae8d0	str x19,[sp, #-0x20]!
009ae8d4	stp x29,x30,[sp, #0x10]
009ae8d8	ldr x19,[x0, #0x9a8]
009ae8dc	add x29,sp,#0x10
009ae8e0	bl 0x00c34a00
009ae8e4	and w8,w0,#0xff
009ae8e8	cmp w8,#0xd
009ae8ec	mov x0,xzr
009ae8f0	b.hi 0x009ae8fc
009ae8f4	add x8,x19,w8, UXTW  #0x3
009ae8f8	ldr x0,[x8, #0x540]
009ae8fc	ldp x29,x30,[sp, #0x10]
009ae900	ldr x19,[sp], #0x20
009ae904	ret

; ssl_prf_md @ 009ae908
009ae908	str x19,[sp, #-0x20]!
009ae90c	stp x29,x30,[sp, #0x10]
009ae910	ldr x19,[x0, #0x9a8]
009ae914	add x29,sp,#0x10
009ae918	bl 0x00c34a00
009ae91c	ubfx w8,w0,#0x8,#0x8
009ae920	cmp w8,#0xd
009ae924	mov x0,xzr
009ae928	b.hi 0x009ae934
009ae92c	add x8,x19,w8, UXTW  #0x3
009ae930	ldr x0,[x8, #0x540]
009ae934	ldp x29,x30,[sp, #0x10]
009ae938	ldr x19,[sp], #0x20
009ae93c	ret

; ASN1_ENUMERATED_get @ 009f3950
009f3950	cbz x0,0x009f39b0
009f3954	ldr w8,[x0, #0x4]
009f3958	mov x1,x0
009f395c	and w8,w8,#0xfffffeff
009f3960	cmp w8,#0xa
009f3964	b.ne 0x009f397c
009f3968	ldr w8,[x1]
009f396c	cmp w8,#0x8
009f3970	b.le 0x009f3984
009f3974	mov w0,#0xffffffff
009f3978	ret
009f397c	mov x0,#-0x1
009f3980	ret
009f3984	sub sp,sp,#0x20
009f3988	add x0,sp,#0x8
009f398c	mov w2,#0xa
009f3990	stp x29,x30,[sp, #0x10]
009f3994	add x29,sp,#0x10
009f3998	bl 0x009f320c
009f399c	ldr x8,[sp, #0x8]
009f39a0	ldp x29,x30,[sp, #0x10]
009f39a4	cmp w0,#0x0
009f39a8	csinv x0,x8,xzr,ne
009f39ac	add sp,sp,#0x20
009f39b0	ret

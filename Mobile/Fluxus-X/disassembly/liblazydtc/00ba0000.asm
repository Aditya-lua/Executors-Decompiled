; mbedtls_psa_pake_abort @ 00ba0000
00ba0000	str x19,[sp, #-0x20]!
00ba0004	stp x29,x30,[sp, #0x10]
00ba0008	add x29,sp,#0x10
00ba000c	mov x19,x0
00ba0010	ldr x0,[x0, #0x8]
00ba0014	ldr x1,[x19, #0x10]
00ba0018	bl 0x00c42230
00ba001c	ldr w8,[x19]
00ba0020	mov w9,#0x100
00ba0024	movk w9,#0xa00, LSL #16
00ba0028	stp xzr,xzr,[x19, #0x8]
00ba002c	cmp w8,w9
00ba0030	b.ne 0x00ba0054
00ba0034	mov w8,#0x2
00ba0038	add x0,x19,#0x1c
00ba003c	mov w1,#0x150
00ba0040	str w8,[x19, #0x18]
00ba0044	bl 0x00c42220
00ba0048	add x0,x19,#0x180
00ba004c	stp xzr,xzr,[x19, #0x170]
00ba0050	bl 0x00c42590
00ba0054	str wzr,[x19]
00ba0058	ldp x29,x30,[sp, #0x10]
00ba005c	mov w0,wzr
00ba0060	ldr x19,[sp], #0x20
00ba0064	ret

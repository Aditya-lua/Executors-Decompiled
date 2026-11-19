; FUN_0090ed90 @ 0090ed90
0090ed90	stp x20,x19,[sp, #-0x20]!
0090ed94	stp x29,x30,[sp, #0x10]
0090ed98	add x29,sp,#0x10
0090ed9c	ldr x8,[x0, #0xda0]
0090eda0	mov x19,x0
0090eda4	cbz x8,0x0090edbc
0090eda8	ldr w9,[x8, #0x38]
0090edac	mov w0,#0x1
0090edb0	str w9,[x1]
0090edb4	str x19,[x8, #0x30]
0090edb8	b 0x0090ee18
0090edbc	ldr x20,[x19, #0xda8]
0090edc0	bl 0x00941cb8
0090edc4	ldp x2,x3,[x20]
0090edc8	bl 0x00941d54
0090edcc	cmp x0,#0x3
0090edd0	mov x1,xzr
0090edd4	b.lt 0x0090ee08
0090edd8	cmp x0,#0x32
0090eddc	b.gt 0x0090edf8
0090ede0	mov w9,#0xaaab
0090ede4	and w8,w0,#0xff
0090ede8	movk w9,#0xaaaa, LSL #16
0090edec	umull x8,w8,w9
0090edf0	lsr x1,x8,#0x21
0090edf4	b 0x0090ee08
0090edf8	cmp x0,#0xfb
0090edfc	mov w8,#0xc8
0090ee00	mov w9,#0x32
0090ee04	csel x1,x9,x8,lt
0090ee08	mov w2,#0x1
0090ee0c	mov x0,x19
0090ee10	bl 0x0092aff8
0090ee14	mov w0,wzr
0090ee18	ldp x29,x30,[sp, #0x10]
0090ee1c	ldp x20,x19,[sp], #0x20
0090ee20	ret

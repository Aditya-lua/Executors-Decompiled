; ENGINE_register_pkey_meths @ 00a53958
00a53958	str x19,[sp, #-0x20]!
00a5395c	stp x29,x30,[sp, #0x10]
00a53960	ldr x8,[x0, #0x48]
00a53964	add x29,sp,#0x10
00a53968	cbz x8,0x00a539b0
00a5396c	add x2,sp,#0x8
00a53970	mov x1,xzr
00a53974	mov w3,wzr
00a53978	mov x19,x0
00a5397c	blr x8
00a53980	cmp w0,#0x0
00a53984	b.le 0x00a539b0
00a53988	ldr x3,[sp, #0x8]
00a5398c	mov w4,w0
00a53990	adrp x0,0xd21000
00a53994	adrp x1,0xa53000
00a53998	add x0,x0,#0xa00
00a5399c	add x1,x1,#0x9c0
00a539a0	mov x2,x19
00a539a4	mov w5,wzr
00a539a8	bl 0x00c3bce0
00a539ac	b 0x00a539b4
00a539b0	mov w0,#0x1
00a539b4	ldp x29,x30,[sp, #0x10]
00a539b8	ldr x19,[sp], #0x20
00a539bc	ret

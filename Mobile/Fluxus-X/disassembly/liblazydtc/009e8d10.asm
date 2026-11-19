; FUN_009e8d10 @ 009e8d10
009e8d10	stp x29,x30,[sp, #-0x10]!
009e8d14	mov w2,#0x400
009e8d18	mov x3,xzr
009e8d1c	mov x4,xzr
009e8d20	mov x29,sp
009e8d24	bl 0x00c36e60
009e8d28	cmp w0,#0x0
009e8d2c	cset w0,ne
009e8d30	ldp x29,x30,[sp], #0x10
009e8d34	ret

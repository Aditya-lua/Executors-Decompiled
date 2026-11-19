; FUN_00bfb964 @ 00bfb964
00bfb964	paciasp
00bfb968	stp x29,x30,[sp, #-0x30]!
00bfb96c	str x21,[sp, #0x10]
00bfb970	stp x20,x19,[sp, #0x20]
00bfb974	mov x29,sp
00bfb978	mov x19,x1
00bfb97c	mov x20,x0
00bfb980	mov x21,x8
00bfb984	bl 0x00c2ff50
00bfb988	mov x3,x0
00bfb98c	mov x0,x19
00bfb990	mov x1,xzr
00bfb994	mov x2,x20
00bfb998	bl 0x00c314c0
00bfb99c	ldr q0,[x0]
00bfb9a0	ldr x8,[x0, #0x10]
00bfb9a4	stp xzr,xzr,[x0]
00bfb9a8	str q0,[x21]
00bfb9ac	str x8,[x21, #0x10]
00bfb9b0	str xzr,[x0, #0x10]
00bfb9b4	ldp x20,x19,[sp, #0x20]
00bfb9b8	ldr x21,[sp, #0x10]
00bfb9bc	ldp x29,x30,[sp], #0x30
00bfb9c0	autiasp
00bfb9c4	ret

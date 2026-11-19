; DSA_set_method @ 00a206e8
00a206e8	stp x20,x19,[sp, #-0x20]!
00a206ec	stp x29,x30,[sp, #0x10]
00a206f0	ldr x8,[x0, #0xa0]
00a206f4	mov x19,x0
00a206f8	mov x20,x1
00a206fc	add x29,sp,#0x10
00a20700	ldr x8,[x8, #0x38]
00a20704	cbz x8,0x00a20710
00a20708	mov x0,x19
00a2070c	blr x8
00a20710	ldr x0,[x19, #0xa8]
00a20714	bl 0x00c32360
00a20718	stp x20,xzr,[x19, #0xa0]
00a2071c	ldr x8,[x20, #0x30]
00a20720	cbz x8,0x00a2072c
00a20724	mov x0,x19
00a20728	blr x8
00a2072c	ldp x29,x30,[sp, #0x10]
00a20730	mov w0,#0x1
00a20734	ldp x20,x19,[sp], #0x20
00a20738	ret

; EC_KEY_new_by_curve_name @ 00a2e740
00a2e740	stp x20,x19,[sp, #-0x20]!
00a2e744	mov w20,w0
00a2e748	mov x0,xzr
00a2e74c	mov x1,xzr
00a2e750	mov x2,xzr
00a2e754	stp x29,x30,[sp, #0x10]
00a2e758	add x29,sp,#0x10
00a2e75c	bl 0x00c3ad50
00a2e760	mov x19,x0
00a2e764	cbz x0,0x00a2e7a8
00a2e768	mov x0,xzr
00a2e76c	mov x1,xzr
00a2e770	mov w2,w20
00a2e774	bl 0x00c3ac40
00a2e778	str x0,[x19, #0x18]
00a2e77c	cbz x0,0x00a2e79c
00a2e780	ldr x8,[x19]
00a2e784	ldr x8,[x8, #0x28]
00a2e788	cbz x8,0x00a2e7a8
00a2e78c	mov x1,x0
00a2e790	mov x0,x19
00a2e794	blr x8
00a2e798	cbnz w0,0x00a2e7a8
00a2e79c	mov x0,x19
00a2e7a0	bl 0x00a2e658
00a2e7a4	mov x19,xzr
00a2e7a8	ldp x29,x30,[sp, #0x10]
00a2e7ac	mov x0,x19
00a2e7b0	ldp x20,x19,[sp], #0x20
00a2e7b4	ret

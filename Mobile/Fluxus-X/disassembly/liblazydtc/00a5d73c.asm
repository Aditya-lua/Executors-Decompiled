; evp_generic_fetch_by_number @ 00a5d73c
00a5d73c	sub sp,sp,#0x70
00a5d740	mov x8,x4
00a5d744	mov x7,x5
00a5d748	mov x5,x3
00a5d74c	mov w3,w2
00a5d750	mov w2,w1
00a5d754	stp x6,x0,[sp]
00a5d758	add x0,sp,#0x8
00a5d75c	mov x1,xzr
00a5d760	mov x4,xzr
00a5d764	mov x6,x8
00a5d768	str x19,[sp, #0x50]
00a5d76c	stp x29,x30,[sp, #0x60]
00a5d770	add x29,sp,#0x60
00a5d774	str xzr,[sp, #0x28]
00a5d778	bl 0x00a5d3a4
00a5d77c	ldr x8,[sp, #0x28]
00a5d780	mov x19,x0
00a5d784	cbz x8,0x00a5d790
00a5d788	mov x0,x8
00a5d78c	bl 0x00c3b5c0
00a5d790	mov x0,x19
00a5d794	ldp x29,x30,[sp, #0x60]
00a5d798	ldr x19,[sp, #0x50]
00a5d79c	add sp,sp,#0x70
00a5d7a0	ret

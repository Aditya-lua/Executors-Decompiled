; FUN_00a2349c @ 00a2349c
00a2349c	sub sp,sp,#0x50
00a234a0	stp x20,x19,[sp, #0x30]
00a234a4	mov x20,x1
00a234a8	stp x29,x30,[sp, #0x40]
00a234ac	add x29,sp,#0x40
00a234b0	mov x19,x0
00a234b4	add x0,sp,#0x8
00a234b8	mov x1,sp
00a234bc	mov x2,x20
00a234c0	stur xzr,[x29, #-0x18]
00a234c4	str xzr,[sp, #0x18]
00a234c8	stp xzr,xzr,[sp]
00a234cc	bl 0x00c3a9d0
00a234d0	cbz w0,0x00a23568
00a234d4	sub x1,x29,#0x18
00a234d8	sub x2,x29,#0x1c
00a234dc	add x3,sp,#0x10
00a234e0	mov x0,xzr
00a234e4	mov x4,x20
00a234e8	bl 0x00c32be0
00a234ec	cbz w0,0x00a23568
00a234f0	ldp x1,x0,[sp, #0x8]
00a234f4	ldr x2,[sp]
00a234f8	bl 0x00c3a9c0
00a234fc	str x0,[sp, #0x18]
00a23500	cbz x0,0x00a23568
00a23504	ldursw x2,[x29, #-0x1c]
00a23508	add x0,sp,#0x18
00a2350c	sub x1,x29,#0x18
00a23510	bl 0x00c3a960
00a23514	cbz x0,0x00a23530
00a23518	ldr x2,[sp, #0x18]
00a2351c	mov w1,#0x198
00a23520	mov x0,x19
00a23524	bl 0x00c39b70
00a23528	mov w0,#0x1
00a2352c	b 0x00a23568
00a23530	bl 0x00c342a0
00a23534	adrp x0,0x2cb000
00a23538	adrp x2,0x2b4000
00a2353c	add x0,x0,#0x7a0
00a23540	add x2,x2,#0x96
00a23544	mov w1,#0x77
00a23548	bl 0x00c342b0
00a2354c	mov w0,#0x10
00a23550	mov w1,#0x8e
00a23554	mov x2,xzr
00a23558	bl 0x00c342c0
00a2355c	ldr x0,[sp, #0x18]
00a23560	bl 0x00c3a7c0
00a23564	mov w0,wzr
00a23568	ldp x29,x30,[sp, #0x40]
00a2356c	ldp x20,x19,[sp, #0x30]
00a23570	add sp,sp,#0x50
00a23574	ret

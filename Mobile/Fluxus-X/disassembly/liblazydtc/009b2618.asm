; SSL_set_generate_session_id @ 009b2618
009b2618	stp x20,x19,[sp, #-0x20]!
009b261c	stp x29,x30,[sp, #0x10]
009b2620	mov x19,x0
009b2624	ldr x0,[x0, #0x1d68]
009b2628	add x29,sp,#0x10
009b262c	mov x20,x1
009b2630	bl 0x00c356a0
009b2634	cbz w0,0x009b2648
009b2638	ldr x0,[x19, #0x1d68]
009b263c	str x20,[x19, #0x938]
009b2640	bl 0x00c35690
009b2644	mov w0,#0x1
009b2648	ldp x29,x30,[sp, #0x10]
009b264c	ldp x20,x19,[sp], #0x20
009b2650	ret

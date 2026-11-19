; WPACKET_sub_memcpy__ @ 00a9cf48
00a9cf48	str x21,[sp, #-0x30]!
00a9cf4c	mov x21,x1
00a9cf50	mov x1,x3
00a9cf54	stp x20,x19,[sp, #0x10]
00a9cf58	stp x29,x30,[sp, #0x20]
00a9cf5c	add x29,sp,#0x20
00a9cf60	mov x20,x2
00a9cf64	mov x19,x0
00a9cf68	bl 0x00a9c4b4
00a9cf6c	cbz w0,0x00a9cfd0
00a9cf70	cbz x20,0x00a9cfac
00a9cf74	add x2,sp,#0x8
00a9cf78	mov x0,x19
00a9cf7c	mov x1,x20
00a9cf80	bl 0x00a9c32c
00a9cf84	cbz w0,0x00a9cfd0
00a9cf88	ldr q0,[x19, #0x10]
00a9cf8c	dup v1.2D,x20
00a9cf90	add v0.2D,v1.2D,v0.2D
00a9cf94	str q0,[x19, #0x10]
00a9cf98	ldr x0,[sp, #0x8]
00a9cf9c	cbz x0,0x00a9cfac
00a9cfa0	mov x1,x21
00a9cfa4	mov x2,x20
00a9cfa8	bl 0x00c2ffd0
00a9cfac	ldr x1,[x19, #0x28]
00a9cfb0	cbz x1,0x00a9cfd0
00a9cfb4	ldr x8,[x1]
00a9cfb8	cbz x8,0x00a9cfd0
00a9cfbc	mov w2,#0x1
00a9cfc0	mov x0,x19
00a9cfc4	mov w20,#0x1
00a9cfc8	bl 0x00a9cab8
00a9cfcc	cbnz w0,0x00a9cfd4
00a9cfd0	mov w20,wzr
00a9cfd4	mov w0,w20
00a9cfd8	ldp x29,x30,[sp, #0x20]
00a9cfdc	ldp x20,x19,[sp, #0x10]
00a9cfe0	ldr x21,[sp], #0x30
00a9cfe4	ret

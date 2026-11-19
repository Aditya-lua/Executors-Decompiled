; evp_generic_fetch @ 00a5d33c
00a5d33c	sub sp,sp,#0x70
00a5d340	mov x8,x4
00a5d344	mov x7,x5
00a5d348	mov x5,x3
00a5d34c	mov x4,x2
00a5d350	mov w2,w1
00a5d354	stp x6,x0,[sp]
00a5d358	add x0,sp,#0x8
00a5d35c	mov x1,xzr
00a5d360	mov w3,wzr
00a5d364	mov x6,x8
00a5d368	str x19,[sp, #0x50]
00a5d36c	stp x29,x30,[sp, #0x60]
00a5d370	add x29,sp,#0x60
00a5d374	str xzr,[sp, #0x28]
00a5d378	bl 0x00a5d3a4
00a5d37c	ldr x8,[sp, #0x28]
00a5d380	mov x19,x0
00a5d384	cbz x8,0x00a5d390
00a5d388	mov x0,x8
00a5d38c	bl 0x00c3b5c0
00a5d390	mov x0,x19
00a5d394	ldp x29,x30,[sp, #0x60]
00a5d398	ldr x19,[sp, #0x50]
00a5d39c	add sp,sp,#0x70
00a5d3a0	ret

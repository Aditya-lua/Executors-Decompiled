; PEM_write_bio_DHparams @ 00ab5344
00ab5344	sub sp,sp,#0x20
00ab5348	stp x29,x30,[sp, #0x10]
00ab534c	mov x2,x0
00ab5350	adrp x0,0xcb5000
00ab5354	ldr x0,[x0, #0x4d0]
00ab5358	mov x3,x1
00ab535c	adrp x1,0x2b8000
00ab5360	add x1,x1,#0x4cf
00ab5364	mov x4,xzr
00ab5368	mov x5,xzr
00ab536c	mov w6,wzr
00ab5370	mov x7,xzr
00ab5374	add x29,sp,#0x10
00ab5378	str xzr,[sp]
00ab537c	bl 0x00c36070
00ab5380	ldp x29,x30,[sp, #0x10]
00ab5384	add sp,sp,#0x20
00ab5388	ret

; FUN_00bf8300 @ 00bf8300
00bf8300	paciasp
00bf8304	sub sp,sp,#0x50
00bf8308	stp x29,x30,[sp, #0x20]
00bf830c	stp x22,x21,[sp, #0x30]
00bf8310	stp x20,x19,[sp, #0x40]
00bf8314	add x29,sp,#0x20
00bf8318	adrp x20,0xcb4000
00bf831c	mov x19,x1
00bf8320	mov x21,x0
00bf8324	ldr x20,[x20, #0xa38]
00bf8328	str x20,[sp, #0x8]
00bf832c	ldar x8,[x20]
00bf8330	cmn x8,#0x1
00bf8334	b.eq 0x00bf8360
00bf8338	add x8,sp,#0x8
00bf833c	sub x9,x29,#0x8
00bf8340	adrp x0,0xcb4000
00bf8344	stur x8,[x29, #-0x8]
00bf8348	nop
00bf834c	adr x2,0xc0bab0
00bf8350	str x9,[sp, #0x10]
00bf8354	add x1,sp,#0x10
00bf8358	ldr x0,[x0, #0xa38]
00bf835c	bl 0x00c305d0
00bf8360	ldp x8,x10,[x19, #0x10]
00bf8364	ldrsw x9,[x20, #0x8]
00bf8368	sub x22,x9,#0x1
00bf836c	sub x9,x10,x8
00bf8370	cmp x22,x9, ASR #0x3
00bf8374	b.cs 0x00bf8414
00bf8378	ldr x19,[x8, x22, LSL #0x3]
00bf837c	cbz x19,0x00bf8414
00bf8380	add x1,x19,#0x8
00bf8384	mov w0,#0x1
00bf8388	bl 0x00c2bce0
00bf838c	mov x20,x21
00bf8390	ldp x8,x9,[x20, #0x10]!
00bf8394	sub x9,x9,x8
00bf8398	asr x10,x9,#0x3
00bf839c	cmp x10,x22
00bf83a0	b.hi 0x00bf83cc
00bf83a4	add x9,x22,#0x1
00bf83a8	subs x1,x9,x10
00bf83ac	b.ls 0x00bf83c0
00bf83b0	mov x0,x20
00bf83b4	bl 0x00c0b6e4
00bf83b8	ldr x8,[x20]
00bf83bc	b 0x00bf83cc
00bf83c0	b.cs 0x00bf83cc
00bf83c4	add x9,x8,x9, LSL #0x3
00bf83c8	str x9,[x21, #0x18]
00bf83cc	ldr x21,[x8, x22, LSL #0x3]
00bf83d0	cbz x21,0x00bf83f4
00bf83d4	add x1,x21,#0x8
00bf83d8	mov x0,#-0x1
00bf83dc	bl 0x00c2bd10
00bf83e0	cbnz x0,0x00bf83f4
00bf83e4	ldr x8,[x21]
00bf83e8	mov x0,x21
00bf83ec	ldr x8,[x8, #0x10]
00bf83f0	blr x8
00bf83f4	ldr x8,[x20]
00bf83f8	str x19,[x8, x22, LSL #0x3]
00bf83fc	ldp x20,x19,[sp, #0x40]
00bf8400	ldp x22,x21,[sp, #0x30]
00bf8404	ldp x29,x30,[sp, #0x20]
00bf8408	add sp,sp,#0x50
00bf840c	autiasp
00bf8410	ret
00bf8414	bl 0x00bd8968

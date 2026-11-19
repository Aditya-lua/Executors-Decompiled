; FUN_00b54324 @ 00b54324
00b54324	sub sp,sp,#0xb0
00b54328	str x21,[sp, #0x80]
00b5432c	stp x20,x19,[sp, #0x90]
00b54330	mov x19,x2
00b54334	mov x21,x1
00b54338	mov x20,x0
00b5433c	add x0,sp,#0x30
00b54340	mov w2,#0x50
00b54344	mov w1,wzr
00b54348	stp x29,x30,[sp, #0xa0]
00b5434c	add x29,sp,#0xa0
00b54350	bl 0x00c301c0
00b54354	stur wzr,[x29, #-0x14]
00b54358	bl 0x00c41000
00b5435c	cbz w0,0x00b543c4
00b54360	ldr x0,[x20, #0x8]
00b54364	sub x2,x29,#0x14
00b54368	mov x1,x21
00b5436c	bl 0x00c3cd20
00b54370	cbz w0,0x00b543c4
00b54374	mov w8,#0x10
00b54378	adrp x0,0x2c5000
00b5437c	stur w8,[x29, #-0x14]
00b54380	add x0,x0,#0xa75
00b54384	add x8,sp,#0x8
00b54388	mov w2,#0x10
00b5438c	mov x1,x21
00b54390	bl 0x00c34c50
00b54394	ldr x8,[sp, #0x28]
00b54398	ldur q0,[sp, #0x18]
00b5439c	ldur q1,[sp, #0x8]
00b543a0	add x1,sp,#0x30
00b543a4	str x8,[sp, #0x50]
00b543a8	stp q1,q0,[sp, #0x30]
00b543ac	ldr x0,[x20, #0x8]
00b543b0	bl 0x00c36d50
00b543b4	cbz w0,0x00b543c4
00b543b8	ldursw x8,[x29, #-0x14]
00b543bc	mov w0,#0x1
00b543c0	str x8,[x19]
00b543c4	ldp x29,x30,[sp, #0xa0]
00b543c8	ldp x20,x19,[sp, #0x90]
00b543cc	ldr x21,[sp, #0x80]
00b543d0	add sp,sp,#0xb0
00b543d4	ret

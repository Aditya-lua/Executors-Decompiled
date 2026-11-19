; FUN_009fd2f8 @ 009fd2f8
009fd2f8	str x21,[sp, #-0x30]!
009fd2fc	stp x20,x19,[sp, #0x10]
009fd300	stp x29,x30,[sp, #0x20]
009fd304	add x29,sp,#0x20
009fd308	cbz x1,0x009fd3ec
009fd30c	mov w19,w2
009fd310	mov x20,x1
009fd314	mov w1,#0x69
009fd318	add x3,sp,#0xc
009fd31c	mov x2,xzr
009fd320	mov x21,x0
009fd324	bl 0x009fcb54
009fd328	cmp x0,#0x1
009fd32c	b.lt 0x009fd34c
009fd330	ldr w8,[x21, #0x30]
009fd334	ldr w0,[sp, #0xc]
009fd338	mov x2,x20
009fd33c	and w1,w8,#0x1
009fd340	bl 0x00c38660
009fd344	cmn w0,#0x1
009fd348	b.ne 0x009fd3f0
009fd34c	mov x0,xzr
009fd350	bl 0x00c30970
009fd354	subs x8,x20,x0
009fd358	b.mi 0x009fd398
009fd35c	cbz x8,0x009fd3a0
009fd360	mov w9,#0x3e8
009fd364	mul x11,x8,x9
009fd368	mov w10,#0x4dd3
009fd36c	mul w8,w8,w9
009fd370	cmp x11,w19, UXTW 
009fd374	movk w10,#0x1062, LSL #16
009fd378	csel w8,w8,w19,cc
009fd37c	umull x10,w8,w10
009fd380	lsr x10,x10,#0x26
009fd384	msub w10,w10,w9,w8
009fd388	cmp w8,#0x3e8
009fd38c	mul w19,w10,w9
009fd390	b.cs 0x009fd3d0
009fd394	b 0x009fd3e4
009fd398	mov w0,wzr
009fd39c	b 0x009fd3f0
009fd3a0	cmp w19,#0x3e8
009fd3a4	mov w8,#0x3e8
009fd3a8	b.cs 0x009fd3cc
009fd3ac	mov w10,#0x4dd3
009fd3b0	and w9,w19,#0xffff
009fd3b4	movk w10,#0x1062, LSL #16
009fd3b8	umull x10,w9,w10
009fd3bc	lsr x10,x10,#0x26
009fd3c0	msub w9,w10,w8,w9
009fd3c4	mul w19,w9,w8
009fd3c8	b 0x009fd3e4
009fd3cc	mov w19,wzr
009fd3d0	mov w9,#0x4dd3
009fd3d4	movk w9,#0x1062, LSL #16
009fd3d8	umull x8,w8,w9
009fd3dc	lsr x0,x8,#0x26
009fd3e0	bl 0x00c386b0
009fd3e4	mov w0,w19
009fd3e8	bl 0x00c386c0
009fd3ec	mov w0,#0x1
009fd3f0	ldp x29,x30,[sp, #0x20]
009fd3f4	ldp x20,x19,[sp, #0x10]
009fd3f8	ldr x21,[sp], #0x30
009fd3fc	ret

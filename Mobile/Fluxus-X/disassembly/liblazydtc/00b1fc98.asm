; ossl_prov_bio_printf @ 00b1fc98
00b1fc98	sub sp,sp,#0x130
00b1fc9c	stp x29,x30,[sp, #0x120]
00b1fca0	add x29,sp,#0x120
00b1fca4	orr x8,xzr,#-0x7f00000080
00b1fca8	mov x9,sp
00b1fcac	add x10,sp,#0x80
00b1fcb0	movk x8,#0xffd0
00b1fcb4	add x11,x29,#0x10
00b1fcb8	add x9,x9,#0x80
00b1fcbc	add x10,x10,#0x30
00b1fcc0	stur x8,[x29, #-0x38]
00b1fcc4	adrp x8,0xd23000
00b1fcc8	stp x11,x10,[x29, #-0x50]
00b1fccc	stur x9,[x29, #-0x40]
00b1fcd0	stp q0,q1,[sp]
00b1fcd4	ldr x8,[x8, #0x800]
00b1fcd8	ldp q1,q0,[x29, #-0x50]
00b1fcdc	str x28,[sp, #0x110]
00b1fce0	stp q6,q7,[sp, #0x60]
00b1fce4	stp q4,q5,[sp, #0x40]
00b1fce8	stp q2,q3,[sp, #0x20]
00b1fcec	stp x6,x7,[sp, #0xa0]
00b1fcf0	stp x4,x5,[sp, #0x90]
00b1fcf4	stp x2,x3,[sp, #0x80]
00b1fcf8	stp q1,q0,[x29, #-0x70]
00b1fcfc	cbz x8,0x00b1fd14
00b1fd00	ldp q1,q0,[x29, #-0x70]
00b1fd04	sub x2,x29,#0x30
00b1fd08	stp q1,q0,[x29, #-0x30]
00b1fd0c	blr x8
00b1fd10	b 0x00b1fd18
00b1fd14	mov w0,#0xffffffff
00b1fd18	ldp x29,x30,[sp, #0x120]
00b1fd1c	ldr x28,[sp, #0x110]
00b1fd20	add sp,sp,#0x130
00b1fd24	ret

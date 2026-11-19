; ERR_set_error @ 00a557f0
00a557f0	sub sp,sp,#0x110
00a557f4	stp x29,x30,[sp, #0x100]
00a557f8	add x29,sp,#0x100
00a557fc	orr x8,xzr,#-0x7f00000080
00a55800	movk x8,#0xffd8
00a55804	mov x9,sp
00a55808	sub x10,x29,#0x78
00a5580c	stur x8,[x29, #-0x18]
00a55810	add x8,x29,#0x10
00a55814	add x9,x9,#0x80
00a55818	add x10,x10,#0x28
00a5581c	stp x8,x10,[x29, #-0x30]
00a55820	stur x9,[x29, #-0x20]
00a55824	stp q0,q1,[sp]
00a55828	ldp q1,q0,[x29, #-0x30]
00a5582c	stp q6,q7,[sp, #0x60]
00a55830	stp q4,q5,[sp, #0x40]
00a55834	stp q2,q3,[sp, #0x20]
00a55838	stur x3,[x29, #-0x78]
00a5583c	sub x3,x29,#0x50
00a55840	str x28,[sp, #0xf0]
00a55844	stp x6,x7,[x29, #-0x60]
00a55848	stp x4,x5,[x29, #-0x70]
00a5584c	stp q1,q0,[x29, #-0x50]
00a55850	bl 0x00a55864
00a55854	ldp x29,x30,[sp, #0x100]
00a55858	ldr x28,[sp, #0xf0]
00a5585c	add sp,sp,#0x110
00a55860	ret

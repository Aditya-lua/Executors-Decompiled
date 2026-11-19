; ERR_add_error_data @ 00a550dc
00a550dc	sub sp,sp,#0x120
00a550e0	orr x8,xzr,#-0x7f00000080
00a550e4	stp x29,x30,[sp, #0x110]
00a550e8	add x29,sp,#0x110
00a550ec	movk x8,#0xffc8
00a550f0	mov x9,sp
00a550f4	add x10,sp,#0x88
00a550f8	add x11,x29,#0x10
00a550fc	stur x8,[x29, #-0x18]
00a55100	add x8,x9,#0x80
00a55104	add x9,x10,#0x38
00a55108	stp x11,x9,[x29, #-0x30]
00a5510c	stur x8,[x29, #-0x20]
00a55110	stp q0,q1,[sp]
00a55114	ldp q1,q0,[x29, #-0x30]
00a55118	stp x1,x2,[sp, #0x88]
00a5511c	sub x1,x29,#0x50
00a55120	str x28,[sp, #0x100]
00a55124	stp q6,q7,[sp, #0x60]
00a55128	stp q4,q5,[sp, #0x40]
00a5512c	stp q2,q3,[sp, #0x20]
00a55130	stp x6,x7,[sp, #0xb0]
00a55134	stp x4,x5,[sp, #0xa0]
00a55138	str x3,[sp, #0x98]
00a5513c	stp q1,q0,[x29, #-0x50]
00a55140	bl 0x00a55154
00a55144	ldp x29,x30,[sp, #0x110]
00a55148	ldr x28,[sp, #0x100]
00a5514c	add sp,sp,#0x120
00a55150	ret

; gf_add @ 00a4a944
00a4a944	ldr x8,[x1]
00a4a948	ldr x9,[x2]
00a4a94c	add x9,x9,x8
00a4a950	str x9,[x0]
00a4a954	ldr x8,[x1, #0x8]
00a4a958	ldr x10,[x2, #0x8]
00a4a95c	add x10,x10,x8
00a4a960	str x10,[x0, #0x8]
00a4a964	ldr x8,[x1, #0x10]
00a4a968	ldr x11,[x2, #0x10]
00a4a96c	add x11,x11,x8
00a4a970	str x11,[x0, #0x10]
00a4a974	ldr x8,[x1, #0x18]
00a4a978	ldr x12,[x2, #0x18]
00a4a97c	and x14,x11,#0xffffffffffffff
00a4a980	add x14,x14,x10, LSR #0x38
00a4a984	and x10,x10,#0xffffffffffffff
00a4a988	add x8,x12,x8
00a4a98c	str x8,[x0, #0x18]
00a4a990	ldr x12,[x1, #0x20]
00a4a994	ldr x13,[x2, #0x20]
00a4a998	and x16,x8,#0xffffffffffffff
00a4a99c	add x11,x16,x11, LSR #0x38
00a4a9a0	add x10,x10,x9, LSR #0x38
00a4a9a4	add x12,x13,x12
00a4a9a8	str x12,[x0, #0x20]
00a4a9ac	ldr x13,[x1, #0x28]
00a4a9b0	ldr x15,[x2, #0x28]
00a4a9b4	and x9,x9,#0xffffffffffffff
00a4a9b8	add x13,x15,x13
00a4a9bc	str x13,[x0, #0x28]
00a4a9c0	ldr x15,[x1, #0x30]
00a4a9c4	ldr x16,[x2, #0x30]
00a4a9c8	add x15,x16,x15
00a4a9cc	str x15,[x0, #0x30]
00a4a9d0	ldr x17,[x1, #0x38]
00a4a9d4	ldr x18,[x2, #0x38]
00a4a9d8	and x16,x11,#0xffffffffffffff
00a4a9dc	add x16,x16,x14, LSR #0x38
00a4a9e0	and x14,x14,#0xffffffffffffff
00a4a9e4	add x14,x14,x10, LSR #0x38
00a4a9e8	stp x14,x16,[x0, #0x10]
00a4a9ec	add x16,x18,x17
00a4a9f0	and x14,x15,#0xffffffffffffff
00a4a9f4	and x17,x16,#0xffffffffffffff
00a4a9f8	lsr x16,x16,#0x38
00a4a9fc	add x14,x14,x13, LSR #0x38
00a4aa00	and x13,x13,#0xffffffffffffff
00a4aa04	add x12,x16,x12
00a4aa08	add x15,x17,x15, LSR #0x38
00a4aa0c	add x13,x13,x12, LSR #0x38
00a4aa10	and x12,x12,#0xffffffffffffff
00a4aa14	and x17,x14,#0xffffffffffffff
00a4aa18	add x9,x16,x9
00a4aa1c	lsr x16,x15,#0x38
00a4aa20	and x15,x15,#0xffffffffffffff
00a4aa24	add x8,x12,x8, LSR #0x38
00a4aa28	and x10,x10,#0xffffffffffffff
00a4aa2c	add x12,x15,x14, LSR #0x38
00a4aa30	add x14,x17,x13, LSR #0x38
00a4aa34	and x13,x13,#0xffffffffffffff
00a4aa38	add x8,x8,x16
00a4aa3c	add x10,x10,x9, LSR #0x38
00a4aa40	and x9,x9,#0xffffffffffffff
00a4aa44	stp x14,x12,[x0, #0x30]
00a4aa48	add x12,x13,x8, LSR #0x38
00a4aa4c	and x8,x8,#0xffffffffffffff
00a4aa50	add x9,x9,x16
00a4aa54	add x8,x8,x11, LSR #0x38
00a4aa58	stp x8,x12,[x0, #0x20]
00a4aa5c	stp x9,x10,[x0]
00a4aa60	ret

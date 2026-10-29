/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb12a4..0xbb1524 (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb12a4_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bb12a4_2;

typedef struct st_bb12a4_4 {
    char padding_0[266];
    unsigned short field_10a;
} st_bb12a4_4;

typedef struct st_bb12a4_3 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
    char padding_20[240];
    uint128_t field_110;
    unsigned long long field_120;
} st_bb12a4_3;

typedef struct st_bb12a4_5 {
    char padding_0[530];
    unsigned short field_212;
} st_bb12a4_5;

typedef struct st_bb12a4_6 {
    struct st_bb12a4_0 *field_0;
    char padding_8[528];
    unsigned short field_218;
} st_bb12a4_6;

typedef struct st_bb12a4_0 {
    char padding_0[538];
    unsigned short field_21a;
} st_bb12a4_0;

typedef struct st_bb12a4_1 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    struct st_bb12a4_0 *field_18;
    unsigned long long field_20;
    struct st_bb12a4_0 *field_28;
    unsigned long long field_30;
} st_bb12a4_1;

extern long long g_ef8cf8;
extern long long g_ef8d28;
extern long long g_ef8d40;
extern long long g_ef8d58;

unsigned long long sub_bb12a4(st_bb12a4_1 *a0, unsigned long a1)
{
    st_bb12a4_0 *v13;  // x22
    unsigned long v14;  // x23
    st_bb12a4_5 *v23;  // x26
    unsigned long long v24;  // x27
    unsigned long long n;  // x21
    st_bb12a4_4 *v26;  // x23
    unsigned long long dst;  // x0
    unsigned long long v28;  // x8
    st_bb12a4_2 *v29;  // x9
    st_bb12a4_2 *v30;  // x8
    st_bb12a4_3 *v31;  // x8
    unsigned long v32;  // x10
    unsigned long long v15;  // x8
    uint128_t v33;  // q0
    st_bb12a4_2 *v34;  // x10
    st_bb12a4_2 *v35;  // x8
    unsigned long long v36;  // x20
    unsigned long long dst1;  // x0
    unsigned long long i;  // x9
    st_bb12a4_6 *v39;  // x10
    st_bb12a4_0 *v16;  // x24
    unsigned long v17;  // x26
    unsigned long long v18;  // x28
    unsigned long long v19;  // x25
    unsigned long long n1;  // x21
    unsigned long long v21;  // x25
    unsigned long v22;  // x8
    unsigned long v0;  // [bp-0xf8]
    uint128_t v1;  // [bp-0xf0]
    unsigned long v2;  // [bp-0xe0]
    uint128_t v3;  // [bp-0xd0]
    unsigned long v4;  // [bp-0xc0]
    uint128_t v5;  // [bp-0xb8]
    unsigned long v6;  // [bp-0xa8]
    uint128_t v7;  // [bp-0xa0]
    unsigned long v8;  // [bp-0x90]
    uint128_t v9;  // [bp-0x80]
    unsigned long v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a0->field_28;
    v14 = v13->field_21a;
    v15 = a1 + v14;
    if (12 > v15)
    {
        v16 = a0->field_18;
        v17 = v16->field_21a;
        v18 = v17 - a1;
        if (v17 < a1)
            goto LABEL_bb14dc;
        v16->field_21a = v18;
        v13->field_21a = v15;
        v19 = a1 * 24;
        n1 = v14 * 24;
        _memmove(&v13->padding_0[8 + v19], &v13->padding_0[8], n1);
        _memmove(&v13->padding_0[272 + v19], &v13->padding_0[272], n1);
        v21 = v18 + 1;
        v22 = v17 - v21;
        if (v22 != a1 - 1)
            goto LABEL_bb14f4;
        v0 = v14;
        v23 = &v16->padding_0[8];
        v24 = v21 * 24;
        n = v22 * 24;
        _memcpy(&v13->padding_0[8], &v23->padding_0[v24], n);
        v26 = &v16->padding_0[272];
        dst = _memcpy(&v13->padding_0[272], &v26->padding_0[v24], n);
        v28 = v18 * 24;
        v29 = &v23->padding_0[v28];
        v30 = &v26->padding_0[v28];
        v1 = v30->field_0;
        v2 = v30->field_10;
        v31 = a0->field_0 + 24 * a0->field_10;
        v3 = *(int128_t *)(v31->padding_0)[1];
        v32 = *(long long *)((char *)&v31->field_8 + 8);
        v4 = v32;
        v33 = v29->field_0;
        *(unsigned long long *)((char *)&v31->field_8 + 8) = v29->field_10;
        *(uint128_t *)(v31->padding_0)[1] = v33;
        v5 = *(int128_t *)&v31->padding_20[232];
        v6 = v31->field_110;
        *(unsigned long *)&v31->field_110 = v2;
        *(uint128_t *)&v31->padding_20[232] = v1;
        v7 = v3;
        v8 = v4;
        v9 = v5;
        v10 = v6;
        v34 = &v13->padding_0[8 + n];
        v34->field_0 = v3;
        v34->field_10 = v32;
        v35 = &v13->padding_0[272 + n];
        v35->field_0 = v5;
        v35->field_10 = v6;
        if (a0->field_20)
        {
            if (a0->field_30)
            {
                v36 = a1 * 8;
                _memmove(&v13[1].padding_0[4 + v36], &v13[1].padding_0[4], v0 * 8 + 8);
                dst1 = _memcpy(&v13[1].padding_0[4], &v16->padding_0[8 * v21 + 544], v36);
                i = 0;
                do
                {
                    v39 = *(long long *)&v13[1].padding_0[4 + 8 * i];
                    v39->field_218 = i;
                    i += 1;
                    v39->field_0 = v13;
                } while (a1 + v0 + 1 != i);
                return dst1;
            }
        }
        else
        {
            if (!a0->field_30)
                return dst;
        }
    }
    else
    {
        sub_c73c80("assertion failed: old_right_len + count <= CAPACITY", 0x33, &g_ef8d28);
LABEL_bb14dc:
        sub_c73c80("assertion failed: old_left_len >= countassertion failed: old_left_len + count <= CAPACITYassertion failed: old_right_len >= countinternal error: entered unreachable code: empty internal nodeassertion failed: assign.right.len() == 1assertion failed: skip_over_node(function, pattern.first_node, other_edge)assertion failed: first_to_sc_edges.len() == 1assertion failed: second_to_sc_edges.len() == 1assertion failed: new_upvalues_in.contains(&value)assertion failed: self.incomplete_params.is_empty()assertion failed: function.predecessor_blocks(function.entry().unwrap()).next().is_none()assertion failed: new_rvalue.is_none()assertion failed: table.0.iter().filter(|(k, _)| k.is_none()).count() == set_list.index - 1assertion failed: !table.0.last().map_or(false,\n        |(k, v)|\n            k.is_none() &&\n                matches!(v, ast::RValue::VarArg(_) | ast::RValue::Call(_) |\n                    ast::RValue::MethodCall(_)))Range start can not be after range endassertion failed: T::is_node_index() != U::is_node_in", 39, &g_ef8d40);
LABEL_bb14f4:
        sub_c73c80("assertion failed: src.len() == dst.len()assertion failed: idx < CAPACITYassertion failed: edge.height == self.height - 1Hash table capacity overflow", 40, &g_ef8cf8);
    }
    sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_ef8d58);
}

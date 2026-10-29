/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb1524..0xbb17d4 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb1524_4 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bb1524_4;

typedef struct st_bb1524_6 {
    char padding_0[266];
    unsigned short field_10a;
    char padding_10c[4];
    struct st_bb1524_0 *field_110;
} st_bb1524_6;

typedef struct st_bb1524_5 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
    char padding_20[240];
    uint128_t field_110;
    unsigned long long field_120;
} st_bb1524_5;

typedef struct st_bb1524_8 {
    char padding_0[530];
    unsigned short field_212;
} st_bb1524_8;

typedef struct st_bb1524_0 {
    struct st_bb1524_1 *field_0;
    char padding_8[528];
    unsigned short field_218;
} st_bb1524_0;

typedef struct st_bb1524_2 {
    char padding_0[538];
    unsigned short field_21a;
} st_bb1524_2;

typedef struct st_bb1524_7 {
    char padding_0[530];
    unsigned short field_212;
    char padding_214[4];
    struct st_bb1524_0 *field_218;
} st_bb1524_7;

typedef struct st_bb1524_1 {
    char padding_0[8];
    char field_8;
    char padding_9[263];
    char field_110;
    char padding_111[265];
    unsigned short field_21a;
    char padding_21c[4];
    struct st_bb1524_0 *field_220;
} st_bb1524_1;

typedef struct st_bb1524_3 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    struct st_bb1524_1 *field_18;
    unsigned long long field_20;
    struct st_bb1524_2 *field_28;
    unsigned long long field_30;
} st_bb1524_3;

extern long long g_ef8d70;
extern long long g_ef8d88;
extern long long g_ef8da0;

unsigned long long sub_bb1524(st_bb1524_3 *a0, unsigned long a1)
{
    st_bb1524_1 *v12;  // x23
    unsigned long v13;  // x24
    st_bb1524_4 *v22;  // x8
    st_bb1524_5 *v23;  // x8
    uint128_t v24;  // q0
    st_bb1524_7 *v25;  // x10
    unsigned long long v26;  // x11
    st_bb1524_4 *v27;  // x12
    st_bb1524_6 *v28;  // x21
    st_bb1524_4 *v29;  // x8
    unsigned long long v30;  // x27
    unsigned long long n;  // x21
    unsigned long long v14;  // x8
    unsigned long long dst;  // x0
    unsigned long v33;  // x27
    st_bb1524_0 **v34;  // x26
    st_bb1524_0 **ptr;  // x20
    unsigned long long n1;  // x21
    unsigned long long dst1;  // x0
    st_bb1524_0 *v38;  // x8
    unsigned long index;  // x8
    unsigned long v40;  // x9
    unsigned long idx;  // x8
    st_bb1524_2 *v15;  // x22
    unsigned long v42;  // x9
    unsigned long idx1;  // x8
    unsigned long v44;  // x9
    unsigned long idx2;  // x8
    unsigned long v46;  // x9
    unsigned long long i;  // x9
    st_bb1524_0 *v48;  // x10
    unsigned long v16;  // x9
    unsigned long long v17;  // x25
    st_bb1524_8 *v18;  // x28
    unsigned long long v19;  // x26
    unsigned long long v20;  // x8
    st_bb1524_4 *v21;  // x9
    uint128_t v0;  // [bp-0xf0]
    unsigned long v1;  // [bp-0xe0]
    uint128_t v2;  // [bp-0xd0]
    unsigned long v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xb8]
    unsigned long v5;  // [bp-0xa8]
    uint128_t v6;  // [bp-0xa0]
    unsigned long v7;  // [bp-0x90]
    uint128_t v8;  // [bp-0x80]
    unsigned long v9;  // [bp-0x70]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a0->field_18;
    v13 = v12->field_21a;
    v14 = a1 + v13;
    if (12 > v14)
    {
        v15 = a0->field_28;
        v16 = v15->field_21a;
        v17 = v16 - a1;
        if (v16 < a1)
            goto LABEL_bb17a4;
        v12->field_21a = v14;
        v15->field_21a = v17;
        v18 = &v15->padding_0[8];
        v19 = a1 * 24;
        v20 = v19 - 24;
        v21 = &v18->padding_0[v20];
        v22 = &v15->padding_0[272 + v20];
        v0 = v22->field_0;
        v1 = v22->field_10;
        v23 = a0->field_0 + 24 * a0->field_10;
        v2 = *(int128_t *)(v23->padding_0)[1];
        v3 = *(long long *)((char *)&v23->field_8 + 8);
        v24 = v21->field_0;
        *(unsigned long long *)((char *)&v23->field_8 + 8) = v21->field_10;
        *(uint128_t *)(v23->padding_0)[1] = v24;
        v4 = *(int128_t *)&v23->padding_20[232];
        v5 = v23->field_110;
        *(unsigned long *)&v23->field_110 = v1;
        *(uint128_t *)&v23->padding_20[232] = v0;
        v6 = v2;
        v7 = v3;
        v8 = v4;
        v9 = v5;
        v25 = &v12->field_8;
        v26 = v13 * 24;
        v27 = &v25->padding_0[v26];
        v27->field_0 = v2;
        v27->field_10 = v3;
        v28 = &v12->field_110;
        v29 = &v28->padding_0[v26];
        v29->field_0 = v4;
        v29->field_10 = v5;
        v30 = v26 + 24;
        _memcpy(&v25->padding_0[v30], &v15->padding_0[8], v19 - 24);
        _memcpy(&v28->padding_0[v30], &v15->padding_0[272], v19 - 24);
        n = v17 * 24;
        _memmove(&v15->padding_0[8], &v18->padding_0[v19], n);
        dst = _memmove(&v15->padding_0[272], &v15->padding_0[272 + v19], n);
        if (a0->field_20)
        {
            if (a0->field_30)
            {
                v33 = v13 + 1;
                v34 = &v12->field_220;
                ptr = &v34[v33];
                n1 = a1 * 8;
                _memcpy(ptr, &v15[1].padding_0[4], n1);
                dst1 = _memmove(&v15[1].padding_0[4], &v15[1].padding_0[4 + n1], v17 * 8 + 8);
                v38 = *ptr;
                v38->field_0 = v12;
                v38->field_218 = v33;
                if (a1 != 1)
                {
                    index = v13 + 2;
                    v40 = v34[index];
                    *(st_bb1524_1 **)v40 = v12;
                    *(unsigned short *)(v40 + 536) = index;
                    if (a1 != 2)
                    {
                        idx = v13 + 3;
                        v42 = v34[idx];
                        *(st_bb1524_1 **)v42 = v12;
                        *(unsigned short *)(v42 + 536) = idx;
                        if (a1 != 3)
                        {
                            idx1 = v13 + 4;
                            v44 = v34[idx1];
                            *(st_bb1524_1 **)v44 = v12;
                            *(unsigned short *)(v44 + 536) = idx1;
                            if (a1 != 4)
                            {
                                idx2 = v13 + 5;
                                v46 = v34[idx2];
                                *(st_bb1524_1 **)v46 = v12;
                                *(unsigned short *)(v46 + 536) = idx2;
                            }
                        }
                    }
                }
                i = 0;
                do
                {
                    v48 = *(long long *)&v15[1].padding_0[4 + 8 * i];
                    v48->field_218 = i;
                    i += 1;
                    v48->field_0 = v15;
                } while (v17 + 1 != i);
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
        sub_c73c80("assertion failed: old_left_len + count <= CAPACITY", 50, &g_ef8d70);
LABEL_bb17a4:
        sub_c73c80("assertion failed: old_right_len >= countinternal error: entered unreachable code: empty internal nodeassertion failed: assign.right.len() == 1assertion failed: skip_over_node(function, pattern.first_node, other_edge)assertion failed: first_to_sc_edges.len() == 1assertion failed: second_to_sc_edges.len() == 1assertion failed: new_upvalues_in.contains(&value)assertion failed: self.incomplete_params.is_empty()assertion failed: function.predecessor_blocks(function.entry().unwrap()).next().is_none()assertion failed: new_rvalue.is_none()assertion failed: table.0.iter().filter(|(k, _)| k.is_none()).count() == set_list.index - 1assertion failed: !table.0.last().map_or(false,\n        |(k, v)|\n            k.is_none() &&\n                matches!(v, ast::RValue::VarArg(_) | ast::RValue::Call(_) |\n                    ast::RValue::MethodCall(_)))Range start can not be after range endassertion failed: T::is_node_index() != U::is_node_index() || i.index() != j.index()Pre-condition of values_read violated: self.has_block(node", 40, &g_ef8d88);
    }
    sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_ef8da0);
}

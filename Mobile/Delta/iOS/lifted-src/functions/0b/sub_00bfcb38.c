/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfcb38..0xbfcc24 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfcb38_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bfcb38_0;

typedef struct st_bfcb38_1 {
    long long field_0;
    char field_8;
    char field_9;
} st_bfcb38_1;


double sub_bfcb38(st_bfcb38_0 *a0, st_bfcb38_1 *a1)
{
    unsigned long v4;  // x20
    unsigned int v5;  // w23
    long long v14;  // x21
    unsigned long iter;  // x24
    unsigned long v16;  // x20
    unsigned long long v17;  // x0
    long long v18;  // x0
    long long v19;  // x0
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // x24
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4102
    unsigned long long v11;  // x22
    unsigned long long ptr;  // x0
    unsigned long long i;  // x22
    uint128_t v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_8;
    v5 = a1->field_9;
    v6 = v5 & 0xff;
    v7 = v4 & 0xff;
    if (v5 < (unsigned int)v4)
    {
        v8 = 0;
        v9 = arm64g_calculate_condition(147, v6, v7, 0);
        if (v9 & 1)
            goto LABEL_bfcbc8;
LABEL_bfcb6c:
        v11 = (v8 + (v8 & 0xffffffff) * 2) * 8;
        ptr = _malloc(v11);
        if (!ptr)
        {
            v18 = sub_c6b970(8, v11);
            v1 = v11;
            sub_bfa334(&v0);
            v19 = __Unwind_Resume(v18);
            sub_c73e0c(v19);
        }
        i = 0;
        v0 = CONCAT(ptr, v8);
        v14 = a1->field_0;
        iter = ptr + 8;
        v16 = v4;
        do
        {
            v17 = sub_bfa154(v14, v16);
            v16 += 1;
            *(unsigned long *)(iter - 8) = 0x8000000000000000;
            *(unsigned long long *)iter = v17;
            i += 1;
            iter += 24;
        } while ((v5 - v4 & 0xff) != i);
    }
    else
    {
        v8 = v5 - v4 & 0xffffffff;
        v10 = arm64g_calculate_condition(147, v6, v7, 0);
        if (!(v10 & 1))
            goto LABEL_bfcb6c;
LABEL_bfcbc8:
        i = 0;
        v0 = CONCAT(8, 0);
    }
    a0->field_0 = v0;
    a0->field_10 = i;
    return *(unsigned long long *)&v0;
}

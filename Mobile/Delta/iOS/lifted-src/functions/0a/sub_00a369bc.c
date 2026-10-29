/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa369bc..0xa36abc (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a369bc_0 {
    struct st_a369bc_0 *field_0;
    char padding_8[568];
    struct st_a369bc_0 *field_240;
    char padding_248[184];
    char field_300;
    char padding_301[127];
    int field_380;
} st_a369bc_0;


st_a369bc_0 * sub_a369bc(st_a369bc_0 *a0, unsigned int a1, st_a369bc_0 *a2)
{
    st_a369bc_0 *v2;  // x0
    st_a369bc_0 *v3;  // x21
    unsigned long idx;  // x23
    st_a369bc_0 **v5;  // x24
    st_a369bc_0 *v6;  // x0
    st_a369bc_0 *v7;  // x20
    st_a369bc_0 *v8;  // x0
    st_a369bc_0 *v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (!v2)
        return v2;
    v3 = v2;
    idx = v2->field_380;
    v5 = &v2->field_240;
    sub_a6c2e4(v5[idx], "crypto/err/err_local.h", 56);
    if (a0 && (char)a0->field_0)
    {
        v6 = sub_a6bf4c(_strlen(a0) + 1, 0, 0);
        v5[idx] = v6;
        if (v6)
            _strcpy();
    }
    else
    {
        v5[idx] = 0;
    }
    *(unsigned int *)&v3->padding_248[120 + 4 * idx] = a1;
    v7 = &v3->field_300;
    v8 = sub_a6c2e4((&v7->field_0)[idx], "crypto/err/err_local.h", 66);
    if (a2 && (char)a2->field_0)
    {
        v9 = sub_a6bf4c(_strlen(a2) + 1, 0, 0);
        (&v7->field_0)[idx] = v9;
        if (!v9)
            return v9;
        return _strcpy();
    }
    (&v7->field_0)[idx] = 0;
    return v8;
}

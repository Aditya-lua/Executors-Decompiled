/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb34b5c..0xb34cec (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b34b5c_0 {
    struct st_b34b5c_0 *field_0;
} st_b34b5c_0;


st_b34b5c_0 ** sub_b34b5c(long long a0, st_b34b5c_0 **a1, unsigned long a2, long long a3, long long a4, st_b34b5c_0 **a5, long long a6, st_b34b5c_0 **a7, unsigned long a8, st_b34b5c_0 **a9, unsigned long a10, st_b34b5c_0 **a11, unsigned long a12, st_b34b5c_0 **a13, unsigned long a14, st_b34b5c_0 **a15, st_b34b5c_0 **a16)
{
    st_b34b5c_0 **v1;  // x0
    st_b34b5c_0 **v2;  // x0
    st_b34b5c_0 **v11;  // x0
    st_b34b5c_0 **v12;  // x0
    st_b34b5c_0 **v13;  // x0
    st_b34b5c_0 **v14;  // x0
    st_b34b5c_0 **v15;  // x0
    st_b34b5c_0 **v3;  // x0
    st_b34b5c_0 **v4;  // x0
    st_b34b5c_0 **v5;  // x0
    st_b34b5c_0 **v6;  // x0
    st_b34b5c_0 **v7;  // x0
    st_b34b5c_0 **v8;  // x0
    st_b34b5c_0 **v9;  // x0
    st_b34b5c_0 **v10;  // x0
    char *v0;  // [bp-0x10]

    v0 = &a8;
    if (a1)
    {
        v1 = sub_c688bc();
        if (!(unsigned int)v1)
            return v1;
    }
    else
    {
        v2 = sub_a6eaa0();
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = sub_c68640(a0, 0xffffffff);
    if (!(unsigned int)v3)
        return v3;
    if (a13)
    {
        v4 = sub_c683dc(a0, 3);
        if (!(unsigned int)v4)
            return v4;
    }
    if (a11)
    {
        v5 = sub_c683dc(a0, 2);
        if (!(unsigned int)v5)
            return v5;
    }
    if (a15)
    {
        v6 = sub_c6847c(a0, 2);
        if (!(unsigned int)v6)
            return v6;
    }
    if (a9)
    {
        v7 = sub_c683dc(a0, 1);
        if (!(unsigned int)v7)
            return v7;
    }
    if (a7)
    {
        v8 = sub_c683dc(a0, 0, a7, a8);
        if (!(unsigned int)v8)
            return v8;
    }
    if (a5)
    {
        v9 = sub_c68354(a0, 0xffffffff, a5, a6);
        if (!(unsigned int)v9)
            return v9;
    }
    v10 = sub_c68640(a0, 0xffffffff);
    if (!(unsigned int)v10)
        return v10;
    v11 = sub_c6847c(a0, 0xffffffff, 1);
    if (!(unsigned int)v11)
        return v11;
    if (a16)
    {
        v12 = sub_a6e990(a0);
        *a16 = v12;
        if (!v12)
            return v12;
    }
    v13 = sub_c68354(a0, 0xffffffff, a3, a4);
    if (!(unsigned int)v13)
        return v13;
    v14 = sub_a69b58(a0, 0xffffffff);
    if (!(unsigned int)v14)
        return v14;
    v15 = sub_a69b58(a0, 0xffffffff);
    if (!(unsigned int)v15)
        return v15;
    return sub_a6eaf8(a0) != 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa997a4..0xa998f4 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a997a4(char *a0, unsigned int a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x20
    unsigned long long v6;  // x0
    unsigned long long v7;  // x21
    unsigned long long v8;  // x0
    unsigned long v9;  // x22
    unsigned long long v10;  // x19
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a1)
    {
LABEL_a997c0:
        v4 = sub_9c2b30(0, 0, a0, 0xffffffff);
        if ((int)v4 >= 1)
        {
            v5 = v4;
            v6 = sub_9c7680(0, v5, 6);
            if (!(v6 >> 31 & 1))
            {
                v7 = v6 & 0xffffffff;
                v8 = sub_a6bf4c(v7, "crypto/objects/obj_dat.c", 450);
                if (!v8)
                    return v8;
                v1 = v8;
                v9 = v8;
                sub_9c755c(&v1, 0, v5, 6, 0);
                sub_9c2b30(v1, v5, a0, 0xffffffff);
                v0 = v9;
                v10 = sub_9c321c(0, &v0, v7);
                sub_a6c2e4(v9, "crypto/objects/obj_dat.c", 461);
                return v10;
            }
        }
    }
    else
    {
        if (sub_a69974(*a0))
            goto LABEL_a997c0;
        sub_a368c8();
        sub_a369bc("crypto/objects/obj_dat.c", 435, "OBJ_txt2obj");
        sub_a36abc(8, 103, 0);
    }
    return 0;
}

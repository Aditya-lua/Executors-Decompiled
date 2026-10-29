/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x778e4..0x77abc (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_778e4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long *field_48;
} st_778e4_1;

typedef struct st_778e4_0 {
    char field_0;
} st_778e4_0;

extern unsigned long long g_e6adb8;
extern unsigned long long g_e6ae28;

unsigned long long * sub_778e4(st_778e4_1 *a0, unsigned long long *iter, unsigned long long a2)
{
    unsigned long v4;  // x8
    unsigned long long *v5;  // w20
    unsigned long long v14;  // x11
    unsigned long long v15;  // x12
    unsigned long long *v6;  // x8
    unsigned long long *v7;  // x21
    unsigned long long v8;  // x9
    unsigned long long v9;  // x11
    unsigned long long v10;  // x9
    unsigned long long v11;  // x11
    unsigned long long v12;  // x9
    unsigned long long v13;  // x10
    st_778e4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_778e4_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!iter)
        return 0;
    a0->field_0 = a0->field_0 + a2;
    v4 = (int)a0->field_48;
    if (31 >= v4 + a2)
    {
        _memcpy((char *)a0 + v4 + 40);
        v5 = (unsigned long long *)((int)a0->field_48 + (unsigned int)a2);
        v6 = &g_e6adb8;
    }
    else
    {
        v7 = (char *)iter + a2;
        if ((unsigned int)v4)
        {
            _memcpy((char *)&a0->field_28 + v4);
            v8 = a0->field_10;
            v9 = a0->field_30;
            a0->field_8 = 11400714785074694791 * __ROL__(a0->field_8 + 14029467366897019727 * a0->field_28, 31);
            a0->field_10 = 11400714785074694791 * __ROL__(v8 + 14029467366897019727 * v9, 31);
            v10 = a0->field_20;
            v11 = a0->field_40;
            a0->field_18 = 11400714785074694791 * __ROL__(a0->field_18 + 14029467366897019727 * a0->field_38, 31);
            a0->field_20 = 11400714785074694791 * __ROL__(v10 + 14029467366897019727 * v11, 31);
            iter = (char *)iter - (int)a0->field_48 + 32;
            *(unsigned int *)&a0->field_48 = 0;
        }
        if (v7 >= iter + 4)
        {
            v12 = a0->field_8;
            v13 = a0->field_10;
            v14 = a0->field_18;
            v15 = a0->field_20;
            do
            {
                v12 = 11400714785074694791 * __ROL__(v12 + 14029467366897019727 * *iter, 31);
                a0->field_8 = v12;
                v13 = 11400714785074694791 * __ROL__(v13 + 14029467366897019727 * iter[1], 31);
                a0->field_10 = v13;
                v14 = 11400714785074694791 * __ROL__(v14 + 14029467366897019727 * iter[2], 31);
                a0->field_18 = v14;
                v15 = 11400714785074694791 * __ROL__(v15 + 14029467366897019727 * iter[3], 31);
                a0->field_20 = v15;
                iter += 4;
            } while (iter <= (char *)v7 - 32);
        }
        if (v7 > iter)
        {
            v5 = (unsigned long long *)(unsigned int)(v7 - iter);
            _memcpy(&a0->field_28);
            v6 = &g_e6ae28;
        }
        else
        {
            goto *((void *)(g_e6ae28));
        }
    }
    *(unsigned int *)&a0->field_48 = (unsigned int)v5;
    goto *((void *)(*v6));
}

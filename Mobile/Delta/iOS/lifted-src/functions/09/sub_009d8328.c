/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8328..0x9d83e0 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8328_0 {
    char padding_0[40];
    unsigned long long field_28;
    char padding_30[16];
    long long field_40;
} st_9d8328_0;


unsigned long long sub_9d8328(st_9d8328_0 *a0, unsigned long long a1, int a2)
{
    unsigned long long count;  // x0
    unsigned long long v3;  // x0
    unsigned long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        return 0;
    }
    else if ((int)a0->field_28)
    {
        count = _fread(a1, 1, a2, a0->field_40);
        if ((unsigned int)count)
            return count;
        v3 = _ferror(a0->field_40);
        if (!(unsigned int)v3)
            return v3;
        sub_a368c8();
        v4 = *(int *)___error(sub_a369bc("crypto/bio/bss_file.c", 149, "file_read"), 149, "file_read");
        sub_a368c8(sub_a36abc(2, v4, "calling fread()"), v4, "calling fread()");
        sub_a369bc("crypto/bio/bss_file.c", 151, "file_read");
        sub_a36abc(32, 0x80002, 0);
        return 0xffffffff;
    }
    else
    {
        return 0;
    }
}

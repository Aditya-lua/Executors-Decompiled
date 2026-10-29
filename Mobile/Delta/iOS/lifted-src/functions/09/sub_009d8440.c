/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8440..0x9d8490 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8440_0 {
    char padding_0[64];
    long long field_40;
} st_9d8440_0;


unsigned long long sub_9d8440(st_9d8440_0 *a0, unsigned long long *a1, long long a2)
{
    unsigned long long str;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(char *)a1 = 0;
    str = _fgets(a1, a2, a0->field_40);
    if (!str)
    {
        return str;
    }
    else if (*(char *)a1)
    {
        return _strlen(a1);
    }
    else
    {
        return 0;
    }
}
